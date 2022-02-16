package com.generation.hello.HabilidadesMentalidades;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping ("/hello")


public class HelloHabilidadesMentalidades {
		
	@GetMapping
			
		public String hello() {
				
			return " As habilidades e mentalidades mais utilizadas nessa atividade foi persistência e orientação ao futuro";
		}

}


