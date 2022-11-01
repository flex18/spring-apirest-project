package com.roca.spring.apirest.project.services.inter;

import java.util.List;

import com.roca.spring.apirest.project.models.entity.Cliente;
import com.roca.spring.apirest.project.models.entity.Factura;

public interface ClienteInterface {
	
	public List<Cliente> fndAll();
	
	public Cliente save(Cliente cliente);
	
	public Cliente findById(Long id);
	
	public void delete(Long id);
	
	public Factura findFacturaById(Long id);
	
	public Factura saveFactura(Factura factura);
	
	public void deleteFacturaById(Long id);

}
