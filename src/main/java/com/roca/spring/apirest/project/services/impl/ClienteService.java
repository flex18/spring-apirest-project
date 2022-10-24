package com.roca.spring.apirest.project.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roca.spring.apirest.project.models.entity.Cliente;
import com.roca.spring.apirest.project.repository.IClienteDao;
import com.roca.spring.apirest.project.services.inter.ICliente;

@Service
public class ClienteService implements ICliente{
	
	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	public List<Cliente> fndAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);
	}

	@Override
	public Cliente findById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		clienteDao.deleteById(id);
	}

}
