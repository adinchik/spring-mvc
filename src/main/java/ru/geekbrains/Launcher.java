package ru.geekbrains;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;

import java.net.URL;
import java.security.ProtectionDomain;

public class Launcher {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8189);
        ProtectionDomain domain = Launcher.class.getProtectionDomain();
        URL location = domain.getCodeSource().getLocation();
        WebAppContext webapp = new WebAppContext();
        webapp.setContextPath("/");
        webapp.setWar(location.toExternalForm());
        server.setHandler(webapp);
        server.start();
        server.join();
    }

    @Bean(name = "SessionFactoryDB")
    public SessionFactory getSessionFactory() {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();
        return factory;
    }
}
