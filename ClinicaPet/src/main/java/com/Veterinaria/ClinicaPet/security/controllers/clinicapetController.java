package com.veterinaria.clinicapet.security.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.veterinaria.clinicapet.security.dto.EnderecoRequestDTO;
import com.veterinaria.clinicapet.security.dto.VeterinarioRequestDTO;
import com.veterinaria.clinicapet.security.entities.Veterinario;
import com.veterinaria.clinicapet.security.services.EmailService;
import com.veterinaria.clinicapet.security.services.EnderecoService;
import com.veterinaria.clinicapet.security.services.VeterinarioService;
import com.veterinaria.clinicapet.utils.Util;

@RestController
@RequestMapping("/clinicapet")
public class ClinicaPetController {

	@Autowired
	Util util;

	@Autowired
	EmailService emailService;

	@Autowired
	EnderecoService enderecoService;

	@Autowired
	VeterinarioService veterinarioService;

	@GetMapping
	public String writerTeste() {
		emailService.writerTeste();
		return "Email enviado com sucesso";
	}

	@GetMapping("/envioemail")
	public String writerTeste2() {
		emailService.writerTeste2();
		return "Email enviado com sucesso";
	}

	@GetMapping("/mailsend")
	public String mailSend() {
		emailService.mailSend();
		return "Email enviado com sucesso";
	}

	@PostMapping("/teste-cep")
	public EnderecoRequestDTO testeEndereco(@RequestParam String cep, @RequestParam Integer numero,
			@RequestParam String complemento) {
		return enderecoService.consultarEndereco(cep, numero, complemento);
	}

//	@PostMapping("/teste-cep")
//	public EnderecoResponseDTO testeEndereco(@RequestBody EnderecoRequestDTO enderecoDTO) {
//		return enderecoService.consultarEndereco(enderecoDTO);
//	}

	@PostMapping("/cadastrar-veterinario")
	public ResponseEntity<Veterinario> cadastrarVeterinario(@RequestBody VeterinarioRequestDTO veterinarioDTO) {
	    Veterinario novoVeterinario = veterinarioService.cadastrarVeterinario(veterinarioDTO);
	    return ResponseEntity.ok(novoVeterinario);
	}

	
}
