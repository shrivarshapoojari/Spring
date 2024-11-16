package com.shri.mvc.validation.validation;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {


    private String firstName;
    @NotNull(message = "is required")
    @Size(min=2,message="minimum 2 chars req")
    private String lastName="";


    public Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}



