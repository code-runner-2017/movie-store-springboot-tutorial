package com.moviestore.services;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.moviestore.MovieStoreApplication;
import com.moviestore.domain.dto.Quote;

@Service
public class ParseJsonService {
    private static final Logger log = LoggerFactory.getLogger(MovieStoreApplication.class);

    public Quote getQuote() throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper jsonMapper = new ObjectMapper();
        Quote quote = jsonMapper.readValue(new ClassPathResource("sample.json").getFile(), Quote.class);
        log.info(quote.toString());
        
        return quote;
    }
}
