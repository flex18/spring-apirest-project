package com.roca.spring.apirest.project.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roca.spring.apirest.project.exception.NotFoundException;
import com.roca.spring.apirest.project.models.entity.Producto;
import com.roca.spring.apirest.project.repository.ProductoRepository;
import com.roca.spring.apirest.project.services.inter.ProductoInterface;

@Service
public class ProductoService implements ProductoInterface{
	
	@Autowired
	private ProductoRepository prodRepository;
	
	private boolean atriChange;
	//private boolean stateChange;

	@Override
	public List<Producto> findAll() {
		return (List<Producto>) prodRepository.findAll();
	}

	@Override
	public Producto insert(Producto request) {
		return prodRepository.save(request);
	}

	@Override
	public Producto findById(Long id) {
		return prodRepository.findById(id).orElse(null);
	}

	@Override
	public Producto update(Producto request) {
		return prodRepository.save(request);
	}
	
	public Producto delta(Long id, Producto newData) throws NotFoundException{
		atriChange = false;
		//stateChange = false;
		Producto prodOld = findById(id);
		if(newData.getStock() != null) {
			prodOld.setStock(newData.getStock());
			atriChange = true;
		}		
		return prodOld;		
	}

}
