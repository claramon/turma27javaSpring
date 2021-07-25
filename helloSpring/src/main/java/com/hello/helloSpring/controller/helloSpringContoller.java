package com.hello.helloSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello_Spring")
public class helloSpringContoller {

	@GetMapping
	public String hello() {
		return "Habilidades: para realizar essa atividade, utilizei a persistência, pois trata-se de um novo tópico"
				+ "na matéria, ou seja, um novo desafio."
				+ "Mentalidades: a mentalidade mais usada é de crescimento que, junto com a persistência, me ajudam"
				+ "a ter confiança qu conseguirei entender o assunto.";
	}
}
