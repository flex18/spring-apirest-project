package com.roca.spring.apirest.project.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roca.spring.apirest.project.models.entity.Cliente;
import com.roca.spring.apirest.project.models.entity.Factura;
import com.roca.spring.apirest.project.repository.ClienteRepository;
import com.roca.spring.apirest.project.repository.FacturaRepository;
import com.roca.spring.apirest.project.services.inter.ClienteInterface;

@Service
public class ClienteService implements ClienteInterface{
	
	@Autowired
	private ClienteRepository clienteRepositroy;
	
	@Autowired
	private FacturaRepository facturaRepository;
	
	@Override
	public List<Cliente> fndAll() {
		return (List<Cliente>) clienteRepositroy.findAll();
	}

	@Override
	public Cliente save(Cliente cliente) {
		return clienteRepositroy.save(cliente);
	}

	@Override
	public Cliente findById(Long id) {
		return clienteRepositroy.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		clienteRepositroy.deleteById(id);
	}

	@Override
	public Factura findFacturaById(Long id) {
		return facturaRepository.findById(id).orElse(null);
	}

	@Override
	public Factura saveFactura(Factura factura) {
		return facturaRepository.save(factura);
	}

	@Override
	public void deleteFacturaById(Long id) {
		facturaRepository.deleteById(id);		
	}

}
