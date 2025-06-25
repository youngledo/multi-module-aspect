package com.example.validation;

import com.example.validation.api.InternalStateValidationException;
import com.example.validation.api.Validatable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Order implements Validatable {
    private String number;
    private static final Logger log = LoggerFactory.getLogger(Order.class);

    @Override
    public void validateInternalState() throws InternalStateValidationException {
        log.info("Order#validateInternalState");
        if (this.number == null || this.number.isEmpty()) {
            log.error("number是空的");
        }
    }
}
