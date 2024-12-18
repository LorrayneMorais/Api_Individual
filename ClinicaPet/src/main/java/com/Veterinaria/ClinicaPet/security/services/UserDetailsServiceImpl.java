package com.Veterinaria.ClinicaPet.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Veterinaria.ClinicaPet.security.entities.User;
import com.Veterinaria.ClinicaPet.security.repositories.UserRepository;

@Service 

public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired 
	UserRepository userRepository;

	@Override 
	@Transactional 	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepository.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

		//build-> instância de user
		return UserDetailsImpl.build(user);
	}

}