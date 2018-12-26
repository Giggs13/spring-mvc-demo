package com.giggs13.springdemo.mvc.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
public class Customer {

    private String firstName;
    @NotNull(message = "is required")
    @Size(min = 1, message = "must not be empty")
    private String lastName;
}
