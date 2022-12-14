package com.roca.spring.apirest.project.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.roca.spring.apirest.project.models.entity.Role;
import com.roca.spring.apirest.project.models.entity.Usuario;
import com.roca.spring.apirest.project.services.inter.UsuarioInterface;

@CrossOrigin(origins = "http://localhost:4200", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
	    RequestMethod.DELETE})
@RestController
@RequestMapping("/bodega")
public class UsuarioController {
	
	@Autowired
	private UsuarioInterface userService;
	
	@Autowired
	private BCryptPasswordEncoder passwEncod;
	
	@GetMapping("/usuarios")
	public List<Usuario> listAllUsers(){
		return userService.findAllUsuarios();
	}
	
	
	@PostMapping("/usuarios")
	public Usuario createUser(@RequestBody Usuario request) {
		
		
		Role rol = new Role();
		rol.setId((long) 1);
		rol.setNombre("ROLE_USER");
		List<Role> listRoles = new ArrayList<>();
		listRoles.add(rol);
		request.setRoles(listRoles);		
		request.setPassword(passwEncod.encode(request.getPassword()));
		request.setEnabled(true);		
		return userService.saveUsuario(request);
	}
	
	@GetMapping("/usuarios/{id}")
	public Usuario findUsuarioById(@PathVariable Long id) {
		return userService.findUserById(id);
	}
	
	@PutMapping("/usuarios/{id}")	
	public Usuario updateUsuario(@RequestBody Usuario request, @PathVariable Long id) {
		Usuario oldUser = userService.findUserById(id);
		
		oldUser.setUsername(request.getUsername());
		oldUser.setPassword(passwEncod.encode(request.getPassword()));
		oldUser.setEnabled(true);
		oldUser.setNombre(request.getNombre());
		oldUser.setApellido(request.getApellido());
		oldUser.setEmail(request.getEmail());		
		return userService.saveUsuario(oldUser);
	}

}
