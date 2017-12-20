package com.moviestore.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.moviestore.MovieStoreApplication;
import com.moviestore.domain.dto.Quote;

@Service
public class RestClientService {
    private static final Logger log = LoggerFactory.getLogger(MovieStoreApplication.class);

    public Quote getQuote() {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info(quote.toString());
        
        return quote;
    }
}
