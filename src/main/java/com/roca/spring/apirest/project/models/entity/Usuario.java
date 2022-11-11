package com.roca.spring.apirest.project.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true, length = 20)
	private String username;
	
	@Column(length = 100)
	private String password;
	private Boolean enabled;
	private String nombre;
	private String apellido;
	private String email;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "usuarios_roles", joinColumns = @JoinColumn(name="usuario_id"),
	inverseJoinColumns = @JoinColumn(name="role_id"),
	uniqueConstraints = {@UniqueConstraint(columnNames = {"usuario_id", "role_id"})})
	private List<Role> roles;

}
