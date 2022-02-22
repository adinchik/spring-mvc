package ru.geekbrains;

import java.util.List;

public interface ProductDAO {
    Product findById(int id);
    List<Product> findAll();
    void deleteById(int id);
    Product saveOrUpdate(Product product);
}
