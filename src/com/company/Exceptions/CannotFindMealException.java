package com.company.Exceptions;

public class CannotFindMealException extends Exception {

    public CannotFindMealException() {
        super("Meal Not Found ! \n Try another meal");
    }
}
