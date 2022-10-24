package com.roca.spring.apirest.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.roca.spring.apirest.project.models.entity.Cliente;
import com.roca.spring.apirest.project.services.inter.ICliente;

@RestController
@RequestMapping("/bodega")
@CrossOrigin(origins = "http://192.168.1.140:4200", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH,
	    RequestMethod.DELETE})
public class ClienteController {
	
	@Autowired
	private ICliente clienteService;
	
	
	@GetMapping("/clientes")
	public List<Cliente> listAllClientes(){
		return clienteService.fndAll();
	}
	
	@GetMapping("/clientes/id")
	public Cliente showById(@PathVariable Long id) {
		return clienteService.findById(id);
	}
	
	@PostMapping("/clientes")
	public Cliente create(@RequestBody Cliente cliente) {
		return clienteService.save(cliente);
	}

}
