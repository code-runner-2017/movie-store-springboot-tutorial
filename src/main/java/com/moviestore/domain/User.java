package com.moviestore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    private String id;
    private String username;
    private String password;
    private int enabled;
    
    public User() {
        // default constructor is needed
    }    


    public User(String username, String password) {
        super();
        this.username = username;
        this.password = password;
        this.enabled = 1;
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


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public int getEnabled() {
        return enabled;
    }


    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }
    
    
}
