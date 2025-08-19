package com.antonio.product.utils;

import com.antonio.product.exceptions.InvalidProductDataException;

public class Validates {

    public static <T extends Number> void validateNumber(T value, String message) throws InvalidProductDataException {
        if(value == null){
            throw new InvalidProductDataException(message);
        }
    }

    public static <T> void ValidateObject(T object, String message) throws InvalidProductDataException {
        if(object == null){
            throw new InvalidProductDataException(message);
        }
    }

    public static void validateText(String text, String message) throws InvalidProductDataException {
        if(text == null || text.isEmpty()) {
            throw new InvalidProductDataException(message);
        }
    }
}
