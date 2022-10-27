package com.roca.spring.apirest.project.services.inter;

import com.roca.spring.apirest.project.models.entity.Usuario;

public interface UsuarioInterface {
	
	public Usuario findByUsername(String username);
}
