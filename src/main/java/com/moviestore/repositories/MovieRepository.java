package com.moviestore.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import com.moviestore.domain.Movie;

public interface MovieRepository extends Repository<Movie, String> {
    List<Movie> findAll();
    Optional<Movie> findById(String id);
    Page<Movie> findAll(Pageable page);
    
    void saveAll(Iterable<Movie> movies);
}
