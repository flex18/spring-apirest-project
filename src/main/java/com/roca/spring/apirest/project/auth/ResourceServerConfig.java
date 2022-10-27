package com.roca.spring.apirest.project.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers(HttpMethod.GET, "/bodega/clientes").permitAll()
		/*.antMatchers(HttpMethod.GET, "/bodega/clientes/{id}").hasAnyRole("USER", "ADMIN")
		.antMatchers(HttpMethod.POST, "/bodega/clientes").hasAnyRole("USER", "ADMIN")
		.antMatchers("/bodega/clientes/**").hasAnyRole("USER", "ADMIN")*/
		.anyRequest().authenticated();
	}
	
	//.antMatchers(HttpMethod.POST, "/bodega/clientes").hasRole("ADMIN")
	
}
