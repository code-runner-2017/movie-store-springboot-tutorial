package com.moviestore.repositories;

import org.springframework.data.repository.CrudRepository;

import com.moviestore.domain.Movie;

public interface MovieRepository extends CrudRepository<Movie, String> {

}
