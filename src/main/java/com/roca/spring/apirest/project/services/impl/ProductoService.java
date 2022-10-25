package com.roca.spring.apirest.project.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roca.spring.apirest.project.models.entity.Producto;
import com.roca.spring.apirest.project.repository.ProductoRepository;
import com.roca.spring.apirest.project.services.inter.ProductoInterface;

@Service
public class ProductoService implements ProductoInterface{
	
	@Autowired
	private ProductoRepository prodRepository;

	@Override
	public List<Producto> findAll() {
		return prodRepository.findAll();
	}

	@Override
	public Producto insert(Producto request) {
		return prodRepository.save(request);
	}

	@Override
	public Producto findById(Long id) {
		return prodRepository.findById(id).orElse(null);
	}

}
