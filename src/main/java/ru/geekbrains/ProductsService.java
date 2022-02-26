package ru.geekbrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {
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
