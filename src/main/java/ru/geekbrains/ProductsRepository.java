package ru.geekbrains;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductsRepository {
    private List<Product> products;
    private int counter;

    public ProductsRepository() {
        this.products = new ArrayList<>();
        counter = 0;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product findProductById(int id) {
        for (Product product: products) {
            if (product.getId() == id)
                return product;
        }
        return null;
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public int getNewId() {
        counter++;
        return counter;
    }
}
