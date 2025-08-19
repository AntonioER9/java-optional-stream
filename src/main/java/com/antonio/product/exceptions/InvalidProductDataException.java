package com.antonio.product.exceptions;

public class InvalidProductDataException extends Exception {
    public InvalidProductDataException() {
    }
    public InvalidProductDataException(String message) {
        super(message);
    }
}
