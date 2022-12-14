package com.roca.spring.apirest.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.roca.spring.apirest.project.models.entity.Producto;
import com.roca.spring.apirest.project.services.impl.ProductoService;
import com.roca.spring.apirest.project.services.inter.ProductoInterface;

@CrossOrigin(origins = "http://localhost:4200", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.PATCH})
@RestController
@RequestMapping("/bodega")
public class ProductoController {
	
	@Autowired
	ProductoInterface prodService;
	
	@Autowired
	ProductoService pService;
	
	@GetMapping("/productos")
	public List<Producto> allProducts(){
		return prodService.findAll();
	}
	
	@PostMapping("/productos")
	public Producto createProduct(@RequestBody Producto request) {
		return prodService.insert(request);
	}
	
	@GetMapping("/productos/{id}")
	public Producto findProductById(@PathVariable Long id) {
		return prodService.findById(id);
	}
	
	@PutMapping("/productos/{id}")
	public Producto updateProduct(@RequestBody Producto request, @PathVariable Long id) {
		Producto oldprod = prodService.findById(id);
		oldprod.setNombre(request.getNombre());
		oldprod.setPrecio(request.getPrecio());
		oldprod.setStock(request.getStock());
		return prodService.insert(oldprod);
	}
	
	@PatchMapping("/productos/{id}")
	public Producto updateProducto(@PathVariable Long id, @RequestBody Producto request) {
		Producto prod = pService.delta(id, request);
		prod = prodService.update(prod);
		return prod;
	}
	
}
