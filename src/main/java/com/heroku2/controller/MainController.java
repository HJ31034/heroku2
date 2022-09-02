package com.heroku2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping(value = "/heroku")
	public String main() {
		return "NewFile";
	}

}
