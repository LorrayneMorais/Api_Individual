package com.veterinaria.clinicapet.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinaria.clinicapet.security.dto.EnderecoRequestDTO;
import com.veterinaria.clinicapet.security.dto.EnderecoResponseDTO;
import com.veterinaria.clinicapet.utils.Util;

@Service
public class EnderecoService {
	@Autowired
	Util util;

	public EnderecoRequestDTO consultarEndereco(String cep, Integer numero, String complemento) {
		EnderecoResponseDTO viaCep = util.buscarEndereco(cep);

		EnderecoRequestDTO endereco = new EnderecoRequestDTO();
		endereco.setCep(viaCep.getCep());
		endereco.setBairro(viaCep.getBairro());
		endereco.setComplemento(viaCep.getComplemento());
		endereco.setEstado(viaCep.getEstado());
		endereco.setLocalidade(viaCep.getLocalidade());
		endereco.setLogradouro(viaCep.getLogradouro());
		endereco.setRegiao(viaCep.getRegiao());
		endereco.setUf(viaCep.getUf());
		endereco.setnumero(numero);
		return endereco;
	}

//	public EnderecoRequestDTO consultarEndereco(String cep) {
//		EnderecoResponseDTO viaCep = util.buscarEndereco(cep.getCep());
//
//		EnderecoRequestDTO endereco = new EnderecoRequestDTO();
//		endereco.setCep(viaCep.getCep());
//		endereco.setBairro(viaCep.getBairro());
//		endereco.setComplemento(viaCep.getComplemento());
//		endereco.setEstado(viaCep.getEstado());
//		endereco.setLocalidade(viaCep.getLocalidade());
//		endereco.setLogradouro(viaCep.getLogradouro());
//		endereco.setRegiao(viaCep.getRegiao());
//		endereco.setUf(viaCep.getUf());
//		return endereco;
//	}

}