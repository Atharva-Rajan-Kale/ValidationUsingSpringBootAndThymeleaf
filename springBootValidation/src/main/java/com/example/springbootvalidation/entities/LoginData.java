package com.example.springbootvalidation.entities;

import jakarta.validation.constraints.*;

public class LoginData {
    @NotBlank(message = "User Name can not be empty!!")
    @Size(min=3,max=12,message="User name must be between 3 - 12 characters!!")
    private String userName;
    @Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"
            )
    private String email;

    public boolean isAgreed() {
        return agreed;
    }

    public void setAgreed(boolean agreed) {
        this.agreed = agreed;
    }

    @AssertTrue(message = "Must agree terms and conditions")
    private boolean agreed;

    @Override
    public String toString() {
        return "LoginData{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
