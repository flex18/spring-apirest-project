package com.roca.spring.apirest.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roca.spring.apirest.project.models.entity.Factura;
import com.roca.spring.apirest.project.services.inter.ClienteInterface;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/bodega")
public class FacturaController {
	
	@Autowired
	private ClienteInterface clienteService;
	
	@GetMapping("/facturas/{id}")
	public Factura showById(@PathVariable Long id) {
		return clienteService.findFacturaById(id);
	}
	
	@DeleteMapping("/facturas/{id}")
	public void deleteFactura(@PathVariable Long id) {
		clienteService.deleteFacturaById(id);
	}

}
