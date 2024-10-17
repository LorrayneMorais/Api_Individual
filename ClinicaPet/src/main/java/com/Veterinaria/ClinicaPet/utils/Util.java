package com.veterinaria.clinicapet.utils;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.veterinaria.clinicapet.security.dto.EnderecoResponseDTO;


@Component
public class Util {
	public EnderecoResponseDTO buscarEndereco(String cep) {
		RestTemplate template = new RestTemplate();
		return template.getForObject("https://viacep.com.br/ws/{cep}/json", EnderecoResponseDTO.class,cep);
	}
	
}