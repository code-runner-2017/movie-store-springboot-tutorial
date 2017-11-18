package com.moviestore.controllers.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.moviestore.domain.Movie;
import com.moviestore.services.MovieService;

@RestController
@RequestMapping("/rest/movies")
public class MovieRestController {
    @Autowired
    private MovieService movieService;
    
    @RequestMapping(value="", method = RequestMethod.GET, produces={"application/json; charset=UTF-8"})
    public Iterable<Movie> movies() {
        return movieService.getAllMovies();
    }
}
