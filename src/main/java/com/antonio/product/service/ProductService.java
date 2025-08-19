package com.antonio.product.service;

import com.antonio.product.exceptions.InvalidProductException;
import com.antonio.product.interfaces.ProductRepository;
import com.antonio.product.model.Product;

import java.util.List;
import java.util.Optional;

public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() throws InvalidProductException {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) throws InvalidProductException {
        return productRepository.findById(id);
    }
}
