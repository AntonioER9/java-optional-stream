package com.antonio.product.utils;

import com.antonio.product.exceptions.InvalidProductException;

public class Validates {

    public static <T extends Number> void validateNumber(T value, String message) throws InvalidProductException {
        if(value == null){
            throw new InvalidProductException(message);
        }
    }

    public static <T> void ValidateObject(T object, String message) throws InvalidProductException {
        if(object == null){
            throw new InvalidProductException(message);
        }
    }

    public static void validateText(String text, String message) throws InvalidProductException {
        if(text == null || text.isEmpty()) {
            throw new InvalidProductException(message);
        }
    }
}
