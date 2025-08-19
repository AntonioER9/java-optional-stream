package com.antonio.product.repository;

import com.antonio.product.exceptions.InvalidProductException;
import com.antonio.product.exceptions.ProductNotFoundException;
import com.antonio.product.interfaces.ProductRepository;
import com.antonio.product.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepositoryServices implements ProductRepository {

    private final List<Product> products = new ArrayList<>();

    @Override
    public List<Product> findAll() throws InvalidProductException {
        if (products.isEmpty()) {
            throw new InvalidProductException("La lista está vacia");
        }

        return products;
    }

    @Override
    public Optional<Product> findById(Long id) {
        return products.stream().filter(product -> product.getId().equals(id)).findFirst();
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public void delete(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    @Override
    public void update(Optional<Product> product) {

    }

    @Override
    public boolean existsById(Long id) {
        return products.stream().anyMatch(product -> product.getId().equals(id));
    }
}
