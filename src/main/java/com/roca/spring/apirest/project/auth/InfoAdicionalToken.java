package com.roca.spring.apirest.project.auth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.roca.spring.apirest.project.models.entity.Usuario;
import com.roca.spring.apirest.project.services.inter.UsuarioInterface;

@Component
public class InfoAdicionalToken implements TokenEnhancer{
	
	@Autowired
	UsuarioInterface userInterface;

	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		Usuario user = userInterface.findByUsername(authentication.getName());
		Map<String, Object> info = new HashMap<>();
		info.put("info_adicional", "Hola!: ".concat(authentication.getName()));
		
		info.put("nombre", user.getNombre());
		info.put("apellido", user.getApellido());
		info.put("email", user.getEmail());
		
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		return accessToken;
	}

}
