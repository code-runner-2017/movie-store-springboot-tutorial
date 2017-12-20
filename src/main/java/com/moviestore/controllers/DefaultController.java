package com.moviestore.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DefaultController {

    @RequestMapping("")
    public String index(Model model) {
        Map<String, String> links = new HashMap<String, String>();
        links.put("sample", "/sample");
        links.put("movies", "/movies");
        links.put("/rest/movies", "/rest/movies");
        links.put("/h2-console", "/h2-console");
        
        model.addAttribute("links", links);        
        
        return "index";
    }
    
    @RequestMapping("hello")
	public String hello(Model model) {
        model.addAttribute("msg", "Hello world!");
		return "hello";
	}
	
   @RequestMapping("sample")
    public String getSample(Model model) {
        return "sample";
    }
}
