package com.roca.spring.apirest.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.roca.spring.apirest.project.models.entity.Cliente;
import com.roca.spring.apirest.project.services.inter.ClienteInterface;

@RestController
@RequestMapping("/bodega")
@CrossOrigin(origins = "http://localhost:4200", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
	    RequestMethod.DELETE})
public class ClienteController {
	
	@Autowired
	private ClienteInterface clienteService;
	
	
	@GetMapping("/clientes")
	public List<Cliente> listAllClientes(){
		return clienteService.fndAll();
	}
	
	@GetMapping("/clientes/{id}")
	public Cliente showById(@PathVariable Long id) {
		return clienteService.findById(id);
	}
	
	@PostMapping("/clientes")
	public Cliente create(@RequestBody Cliente cliente) {
		return clienteService.save(cliente);
	}

	@PutMapping("clientes/{id}")
	public Cliente update(@RequestBody Cliente request, @PathVariable Long id){
		Cliente oldCliente = clienteService.findById(id);
		
		oldCliente.setNombre(request.getNombre());
		oldCliente.setApellido(request.getApellido());
		oldCliente.setEmail(request.getEmail());
		
		return clienteService.save(oldCliente);
	}
	
	@DeleteMapping("clientes/{id}")
	public void delete(@PathVariable Long id) {
		clienteService.delete(id);
	}

}
