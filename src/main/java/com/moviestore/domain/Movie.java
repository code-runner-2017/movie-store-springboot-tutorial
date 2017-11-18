package com.moviestore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {
    private String id;
    private String title;
    private String director;
    private int year;
    
    public Movie() {
        // default constructor is needed
    }    
    
    public Movie(String title, String director, int year) {
        super();
        this.title = title;
        this.director = director;
        this.year = year;
    }


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    
    
}
