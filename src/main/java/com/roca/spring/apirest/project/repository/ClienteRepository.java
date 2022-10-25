package com.roca.spring.apirest.project.repository;


import org.springframework.data.repository.CrudRepository;

import com.roca.spring.apirest.project.models.entity.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
