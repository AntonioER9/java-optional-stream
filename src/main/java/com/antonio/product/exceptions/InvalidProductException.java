package com.antonio.product.exceptions;

public class InvalidProductException extends Exception {
    public InvalidProductException() {
    }
    public InvalidProductException(String message) {
        super(message);
    }
}
