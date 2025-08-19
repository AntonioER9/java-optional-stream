package com.antonio.product.service;

import com.antonio.product.exceptions.InvalidProductException;
import com.antonio.product.model.Product;

public class ProductValidator {
    public static void validate(Product product) throws InvalidProductException {

        if(product.getPrice() <= 0){
            throw new InvalidProductException("El precio debe ser mayor a 0");
        }

        if(product.getStock() < 0){
            throw new InvalidProductException("El stock debe ser mayor a 0");
        }
        
    }
}
