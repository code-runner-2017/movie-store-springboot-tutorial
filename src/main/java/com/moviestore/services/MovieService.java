package com.moviestore.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.moviestore.domain.Movie;
import com.moviestore.repositories.MovieRepository;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    
    public Iterable<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
    
    public Page<Movie> getAllMoviesInPage(int pageNr, int pageSize) {
        Page<Movie> moviesPage = movieRepository.findAll(PageRequest.of(pageNr++, pageSize));
        return moviesPage;
    }

    public Optional<Movie> getMovie(String id) {
        return movieRepository.findById(id);
    }

}
