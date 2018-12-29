package com.giggs13.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String[] coursePrefixes;

    @Override
    public void initialize(CourseCode constraintAnnotation) {
        coursePrefixes = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return Objects.isNull(value) || Arrays.stream(coursePrefixes).anyMatch(Predicate.isEqual(value));
    }
}
