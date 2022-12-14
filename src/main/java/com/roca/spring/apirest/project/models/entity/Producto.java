package com.roca.spring.apirest.project.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "productos")
public class Producto implements Serializable{
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private Double precio;
	private Double stock;
	
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private  Date createAt;
	
	@PrePersist
	public void prePersist() {
		createAt = new Date();
	}	
	
	private static final long serialVersionUID = 1L;	

}
