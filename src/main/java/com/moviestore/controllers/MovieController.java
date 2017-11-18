package com.moviestore.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.moviestore.domain.Movie;
import com.moviestore.services.MovieService;

@Controller
@RequestMapping("/movies")
public class MovieController {
    
    @Autowired
    private MovieService movieService;

    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute("movies", movieService.getAllMovies());
        
        return "movies";
    }       
    
    @RequestMapping("{id}") // complete URI: /movies/{id}
    public String index(@PathVariable("id") String id, Model model) {
        Optional<Movie> movie = movieService.getMovie(id);
        model.addAttribute("movie", movie.get());
        
        return "movie";
    }  
}
