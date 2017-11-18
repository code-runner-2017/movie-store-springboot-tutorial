package com.moviestore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DefaultController {

	@RequestMapping
	public String index(Model model) {
		return "hello";
	}
}
