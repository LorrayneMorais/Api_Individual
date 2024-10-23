package com.Veterinaria.ClinicaPet.security.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.Veterinaria.ClinicaPet.security.entities.Foto;
import com.Veterinaria.ClinicaPet.security.entities.User;
import com.Veterinaria.ClinicaPet.security.repositories.FotoRepository;

@Service
public class FotoService {

	@Autowired
	FotoRepository fotoRepository;
	
	
	public Foto cadastrarFoto (MultipartFile foto, User user ) throws IOException {
		Foto fotoUsuario = new Foto();
		fotoUsuario.setDados(foto.getBytes());
		fotoUsuario.setTipo(foto.getContentType());
		fotoUsuario.setNome(foto.getOriginalFilename());
		fotoUsuario.setUser(user);
		return fotoRepository.save(fotoUsuario);
	}
}
