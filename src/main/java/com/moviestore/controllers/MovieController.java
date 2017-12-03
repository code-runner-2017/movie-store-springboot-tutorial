package com.moviestore.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.moviestore.domain.Credit;
import com.moviestore.domain.Movie;
import com.moviestore.services.MovieService;

@Controller
@RequestMapping("/movies")
public class MovieController {
    
    @Autowired
    private MovieService movieService;

    @RequestMapping("")
    public String index(Model model, @RequestParam(value="pageNr", defaultValue="0") Integer pageNr) {
        int pageSize = 10;
        Page<Movie> moviesPage = movieService.getAllMoviesInPage(pageNr, pageSize);
        List<Movie> moviesInPage = moviesPage.getContent();
        
        model.addAttribute("movies", moviesInPage);
        
        model.addAttribute("prevPage", pageNr - 1);
        
        if (moviesPage.getTotalElements() > (pageNr+1) * pageSize) {
            model.addAttribute("nextPage", pageNr + 1);
        } else {
            model.addAttribute("nextPage", -1);
        }
        
        
        return "movies";
    }       
    
    @RequestMapping("{id}") // complete URI: /movies/{id}
    public String index(@PathVariable("id") String id, Model model) {
        Optional<Movie> movie = movieService.getMovie(id);
        model.addAttribute("movie", movie.get());
        
        model.addAttribute("sections", new String[]{"description", "ratings", "comments"});
        
        model.addAttribute("credits", new Credit[]{
                new Credit("Brad Pit", "Policeman", true),
                new Credit("Al Pacino", "Policeman", true),
                new Credit("John Doe", "Murder", false)
        });
        
        return "movie";
    }  
}
