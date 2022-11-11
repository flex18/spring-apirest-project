package com.roca.spring.apirest.project.services.inter;

import java.util.List;

import com.roca.spring.apirest.project.models.entity.Usuario;

public interface UsuarioInterface {
	
	public Usuario findByUsername(String username);
	
	public List<Usuario> findAllUsuarios();
	
	public Usuario saveUsuario(Usuario request);
	
	public Usuario findUserById(Long id);
}
