package com.giggs13.springdemo.mvc.model;

import com.giggs13.springdemo.mvc.validation.CourseCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.*;

@Getter
@Setter
@ToString
public class Customer {

    private String firstName;
    @NotNull(message = "is required")
    @Size(min = 1, message = "must not be empty")
    private String lastName;
    @NotNull(message = "is required")
    @Min(value = 0, message = "must be greater than or equal to zero")
    @Max(value = 10, message = "must be less than or equal to zero")
    private Integer freePasses;
    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode;
    @CourseCode(value = {"LUV", "TOPS"}, message = "must start with TOPS")
    private String courseCode;
}
