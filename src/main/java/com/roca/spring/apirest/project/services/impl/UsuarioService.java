package com.roca.spring.apirest.project.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.roca.spring.apirest.project.models.entity.Usuario;
import com.roca.spring.apirest.project.repository.UsuarioRespository;
import com.roca.spring.apirest.project.services.inter.UsuarioInterface;

@Service
public class UsuarioService implements UsuarioInterface, UserDetailsService{
	
	private Logger log = LoggerFactory.getLogger(UsuarioService.class);
	
	@Autowired
	private UsuarioRespository userRepository;

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario user = userRepository.findByUsername(username);
		
		if (user == null) {
			log.error("Error en el login: no existe el usuario '"+ username+"' en el sistema!");
			throw new UsernameNotFoundException("Error en el login: no existe el usuario  '"+username+"' en el sistema!");
		}
		List<GrantedAuthority> authorities = user.getRoles()
				.stream()
				.map(role -> new SimpleGrantedAuthority(role.getNombre()))
				.peek(authority -> log.info("Role : "+ authority.getAuthority()))
				.collect(Collectors.toList());
		return new User(user.getUsername(), user.getPassword(), user.getEnabled(), true, true, true, authorities);
	}

	@Override
	public Usuario findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

}
