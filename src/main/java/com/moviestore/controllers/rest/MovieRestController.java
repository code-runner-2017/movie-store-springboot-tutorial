package com.moviestore.controllers.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.moviestore.domain.Movie;
import com.moviestore.services.MovieService;

@RestController
@RequestMapping("/rest/movies")
@Scope("session")
public class MovieRestController {
    @Autowired
    private MovieService movieService;
    
    @RequestMapping(value="", method = RequestMethod.GET, produces={"application/json; charset=UTF-8"})
    public Iterable<Movie> movies() {
        return movieService.getAllMovies();
    }
    
    @RequestMapping(value="/addToCart", method = RequestMethod.POST, produces={"application/json; charset=UTF-8"})
    public String addToCart(HttpServletRequest request) {
        Integer cart = (Integer)request.getSession().getAttribute("cart");
        
        if (cart == null) {
            cart = 0;
        }
        
        request.getSession().setAttribute("cart", ++cart);
        
        
        return "OK";
    }
}
