package com.roca.spring.apirest.project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.roca.spring.apirest.project.models.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long>{
	
	public List<Producto> findByNombreContainingIgnoreCase(String term);
	
	public List<Producto> findByNombreStartingWithIgnoreCase(String term);

}
