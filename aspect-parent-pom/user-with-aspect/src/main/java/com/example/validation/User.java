package com.example.validation;

import com.example.validation.api.InternalStateValidationException;
import com.example.validation.api.Validatable;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RequiredArgsConstructor
@Data
public class User implements Validatable {
    private static final Logger log = LoggerFactory.getLogger(User.class);

    private final String name;

    @Override
    public void validateInternalState() throws InternalStateValidationException {
        log.info("user#validateInternalState");
        if (this.getName() == null || this.getName().isEmpty()) {
            throw new InternalStateValidationException("Name cannot be null or empty");
        }
    }
}
