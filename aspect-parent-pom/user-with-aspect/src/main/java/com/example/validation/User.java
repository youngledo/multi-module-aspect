package com.example.validation;

import com.example.validation.api.InternalStateValidationException;
import com.example.validation.api.Validatable;
import lombok.Data;
import lombok.Data;

@Data
public class User implements Validatable {
    private String name;

    @Override
    public void validateInternalState() throws InternalStateValidationException {
        System.out.println("validateInternalState");
        if (this.getName() == null || this.getName().isEmpty()) {
            throw new InternalStateValidationException("Name cannot be null or empty");
        }
    }
}
