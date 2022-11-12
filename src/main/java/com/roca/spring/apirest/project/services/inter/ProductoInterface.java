package com.roca.spring.apirest.project.services.inter;

import java.util.List;

import com.roca.spring.apirest.project.models.entity.Producto;

public interface ProductoInterface {
	
	public List<Producto> findAll();
	
	public Producto insert(Producto request);
	
	public Producto findById(Long id);
	
	public Producto update(Producto request);

}
