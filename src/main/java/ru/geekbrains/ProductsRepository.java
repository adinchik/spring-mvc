package ru.geekbrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductsRepository {
    private ProductDAO productDAO;

    @Autowired
    public void setProductDAO(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public Product findProductById(int id) {
        return productDAO.findById(id);
    }

    public List<Product> getAllProducts() {

        return productDAO.findAll();
    }

    /*public int getNewId() {
        counter++;
        return counter;
    }*/
}
