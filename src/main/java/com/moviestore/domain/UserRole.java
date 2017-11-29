package com.moviestore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserRole {
    private String id;
    private String username;
    private String role;

    
    public UserRole() {
        // default constructor is needed
    }    


    public UserRole(String username, String role) {
        super();
        this.username = username;
        this.role = role;
    }


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public String getRole() {
        return role;
    }


    public void setRole(String role) {
        this.role = role;
    }
}
