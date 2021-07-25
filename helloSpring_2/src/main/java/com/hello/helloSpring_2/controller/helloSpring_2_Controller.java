package com.hello.helloSpring_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloSpring_2")
public class helloSpring_2_Controller {

	@GetMapping
	public String hello(){
		return "Objetivos de aprendizagem da semana: essa semana, pretendo praticar bastante o Spring, para que se"
				+ "torne mais intuitivo. Assim, terei maior habilidade para aplicá-lo ao projto integrador.";
	}
}
