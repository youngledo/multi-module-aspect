package com.example.validation;

import com.example.validation.api.InternalStateValidationException;
import com.example.validation.api.Validatable;

public class Order implements Validatable {
    private String number;

    @Override
    public void validateInternalState() throws InternalStateValidationException {
        System.out.println("validateInternalState");
        if (this.number == null || this.number.isEmpty()) {
            throw new InternalStateValidationException("Name cannot be null or empty");
        }
    }
}
