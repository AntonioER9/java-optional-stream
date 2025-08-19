package com.antonio.product.service;

import com.antonio.product.exceptions.InvalidProductDataException;
import com.antonio.product.exceptions.ProductNotFoundException;
import com.antonio.product.interfaces.ProductRepository;
import com.antonio.product.model.Product;

import java.util.List;
import java.util.Optional;

public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() throws InvalidProductDataException {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public void saveProduct(Product product) throws InvalidProductDataException {
        ProductValidator.validate(product);
        if(!productRepository.existsById(product.getId())) {
            productRepository.save(product);
            System.out.println("Producto guardado exitosamente");
        } else {
            throw new InvalidProductDataException("El producto que desea agregar ya existe");
        }
    }

    public void deleteProduct(Long id) throws ProductNotFoundException {
        Optional<Product> product = productRepository.findById(id);
        if (product.isPresent()) {
            productRepository.delete(id);
            System.out.println("Producto eliminado exitosamente");
        } else {
            throw new ProductNotFoundException("El producto que desea eliminar no existe");
        }
    }

    public void updateProduct(Product product) throws ProductNotFoundException, InvalidProductDataException {
        ProductValidator.validate(product);
        Optional<Product> optinalProduct = productRepository.findById(product.getId());
        if(optinalProduct.isPresent()) {
            productRepository.update(optinalProduct);
            System.out.println("Producto actualizado exitosamente");
        } else {
            throw new ProductNotFoundException("El producto que desea actualizar no existe");
        }
    }
}
