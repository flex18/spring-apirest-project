package com.roca.spring.apirest.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roca.spring.apirest.project.models.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
