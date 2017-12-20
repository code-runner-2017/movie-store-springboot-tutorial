package com.moviestore.config;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppConfigTest {
    @Autowired
    AppConfig appConfig;
    
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test() {        
        String version = appConfig.getVersion();
        assertEquals(version, "1.0");
        System.out.println("************ Version: "+ version);
    }

}
