package br.com.estudo.estudo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String HelloWorld() {
		return "Hello World";
	}
}
