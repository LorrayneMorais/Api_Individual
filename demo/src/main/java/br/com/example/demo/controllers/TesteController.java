package br.com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/teste")
public class TesteController {

	@GetMapping
	public String olaMundo() {
		return ("Hello world!");
	}

}