package com.antonio.product.interfaces;

import com.antonio.product.exceptions.InvalidProductDataException;
import com.antonio.product.exceptions.ProductNotFoundException;
import com.antonio.product.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> findAll() throws InvalidProductDataException;
    Optional<Product> findById(Long id);
    void save(Product product);
    void delete(Long id);
    void update(Optional<Product> product) throws ProductNotFoundException;
    boolean existsById(Long id);

}
