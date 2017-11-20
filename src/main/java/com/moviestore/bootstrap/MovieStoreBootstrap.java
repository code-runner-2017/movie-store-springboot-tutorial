package com.moviestore.bootstrap;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.moviestore.domain.Movie;
import com.moviestore.repositories.MovieRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by jt on 6/13/17.
 */
@Slf4j
@Component
public class MovieStoreBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final MovieRepository movieRepository;

    public MovieStoreBootstrap(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent event) {
        movieRepository.saveAll(getMovies());
        log.debug("Loading Bootstrap Data");
    }

    private List<Movie> getMovies() {

        List<Movie> movies = new ArrayList<>(2);
        Movie bladeRunner = new Movie("Blade Runner", "Ridley Scott", 1982);
        Movie braveheart = new Movie("Braveheart", "Mel Gibson", 1995);
        Movie shining = new Movie("Shining", "Stanley Kubrick", 1980);

        movies.add(bladeRunner);
        movies.add(braveheart);
        movies.add(shining);
        
        for (int i = 1; i < 20; i++) {
            Movie movie = new Movie("Back to the Future "+ i, "Robert Zemeckis", 1980 + i);
            movies.add(movie);
        }
        
        return movies;
    }
}
