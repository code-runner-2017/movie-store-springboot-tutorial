package com.moviestore.domain;

public class Credit {
    private String name;
    private String role;
    private boolean star;
    
    public Credit(String name, String role, boolean star) {
        super();
        this.name = name;
        this.role = role;
        this.star = star;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public boolean isStar() {
        return star;
    }
    public void setStar(boolean star) {
        this.star = star;
    }
}
