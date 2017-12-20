package com.moviestore.services;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.moviestore.domain.dto.Quote;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParseJsonServiceTest {
    @Autowired
    ParseJsonService parseJsonService;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test() throws JsonParseException, JsonMappingException, IOException {
        Quote quote = parseJsonService.getQuote();
        System.out.println(quote);
    }

}
