package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // referente ao controller
@RequestMapping("/hello")// caminho para acessar no postman para encontrar esse controller
public class HelloController {

	@GetMapping// sempre que chamar método "get" dentro de "hello", vai cair dentro do seguinte método
	public String hello() {
		return "Hello Generation!";
	}
}
