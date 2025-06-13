package com.example.validation.api;

/**
 * Exception indicating problems occurred when validating a Validatable instance.
 */
public class InternalStateValidationException extends IllegalStateException {
  /**
   * Constructs an InternalStateValidationException with the specified detail message.
   * A detail message is a String that describes this particular exception.
   *
   * @param message the String that contains a detailed message
   */
  public InternalStateValidationException(final String message) {
    super(message);
  }
}