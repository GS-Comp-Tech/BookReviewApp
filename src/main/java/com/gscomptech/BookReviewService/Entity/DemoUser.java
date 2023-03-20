package com.gscomptech.BookReviewService.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document (collection = "user")
public class DemoUser {

    public String username;
    public String password;
    public List<String> roles;
    public String emailId;

    public DemoUser() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
