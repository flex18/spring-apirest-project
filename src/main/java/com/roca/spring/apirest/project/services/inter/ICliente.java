package com.roca.spring.apirest.project.services.inter;

import java.util.List;

import com.roca.spring.apirest.project.models.entity.Cliente;

public interface ICliente {
	
	public List<Cliente> fndAll();
	
	public Cliente save(Cliente cliente);
	
	public Cliente findById(Long id);
	
	public void delete(Long id);

}
