package com.example.validation.api;

/**
 * Specification for providing an object with validation mechanics.
 * Each com.example.api.validation.Validatable object can perform internal validation to assert
 * its state before being serialized and after being deserialized.
 *
 * Making an object implement com.example.api.validation.Validatable does not imply that all
 * uses of the object is guaranteed. com.example.api.validation.Validatable objects should
 * primarily make use of their own data to ascertain its valid state.
 *
 * It is the responsibilities of services using the com.example.api.validation.Validatable object
 * (as opposed to the validation mechanics provided within this com.example.api.validation.Validatable)
 * to provide extra/semantic validation for object <strong>graphs</strong>
 * in which this com.example.api.validation.Validatable instance is part.
 */
public interface Validatable {
  /**
   * Performs validation of the internal state of this com.example.api.validation.Validatable.
   *
   * @throws InternalStateValidationException
   *          if the state of this com.example.api.validation.Validatable was
   *          in an incorrect state (i.e. invalid).
   */
  void validateInternalState() throws InternalStateValidationException;
}