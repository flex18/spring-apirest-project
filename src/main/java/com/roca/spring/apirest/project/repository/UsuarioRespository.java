package com.roca.spring.apirest.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.roca.spring.apirest.project.models.entity.Usuario;

public interface UsuarioRespository extends CrudRepository<Usuario, Long>{
	
	public Usuario findByUsername(String username);

}
