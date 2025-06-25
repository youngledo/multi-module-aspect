package com.example.validation.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The aspect enforcing validity on a class implementing Validatable (i.e. Entities).
 * This aspect should be fired immediately after a non-default constructor is invoked,
 * and is intended to run as a singleton.
 * <p>
 * Validation should be run only once, and only after the constructor of the ultimate
 * created instance is run (default AspectJ behaviour is to run the Aspect after any
 * constructor within the inheritance hierarchy is executed [i.e. after constructors
 * in superclasses are run, within the constructor of subtypes]).
 */
@Aspect
public class ValidationAspect {
    // Our log
    private static final Logger log = LoggerFactory.getLogger(ValidationAspect.class);

    @Around("execution(void com.example.validation.api.Validatable.validateInternalState(..))")
    public Object validateInternalState(ProceedingJoinPoint pjp) throws Throwable {
        log.info("validateInternalState");
        return pjp.proceed();
    }
}
