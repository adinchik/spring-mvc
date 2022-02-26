package ru.geekbrains;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO{

    private SessionFactory sessionFactory;

    @Autowired
    @Qualifier("SessionFactoryDB")
    public void setSessionFactory(SessionFactory sessionFactory){

        this.sessionFactory = sessionFactory;
    }

    @Override
    public Product findById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Product product = session.get(Product.class, id);
        return product;
    }

    @Override
    public List<Product> findAll() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Product> productList = session.createQuery("from products").list();
        return productList;
    }

    @Override
    public void deleteById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Product product = session.get(Product.class, id);
        if(null != product){
            session.delete(product);
        }
    }

    @Override
    public Product saveOrUpdate(Product product) {
        return null;
    }
}
