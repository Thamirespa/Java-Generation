package com.generation.hello.aprendizagem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping ("/hello")


public class HelloAprendizagem {
	@GetMapping
	
	public String hello() {
			
		return "Integrar os conhecimentos adquiridos com as novas funcionalidades que estão sendo apresentadas";
	}


}
