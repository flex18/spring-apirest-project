package com.roca.spring.apirest.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Registro no encontrado.")
public class NotFoundException  extends RuntimeException{
	private static final long serialVersionUID = 1L;

}
