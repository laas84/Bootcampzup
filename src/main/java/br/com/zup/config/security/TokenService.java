package br.com.zup.config.security;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import br.com.zup.entities.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class TokenService {
	
	@Value("${lastseason.jwt.expiration}")
	private String expiration;
	
	@Value("${lastseason.jwt.secret}")
	private String secret;
	
	public String gerarToken(Authentication authentication) {
		User logado = (User) authentication.getPrincipal();
		Date hoje = new Date();
		Date dataexpiracao = new Date(hoje.getTime() + Long.parseLong(expiration)); 
		return Jwts.builder()
				.setIssuer("Instagram Para ZUP Bootcamp")
				.setSubject(logado.getId().toString())
				.setIssuedAt(hoje)
				.setExpiration(dataexpiracao)
				.signWith(SignatureAlgorithm.HS256, secret)
				.compact();
		
				
	}

	public boolean isTokenValido(String token) {
		try {
			Jwts.parser().setSigningKey(this.secret).parseClaimsJws(token);
			return true;
		} catch (Exception e) {
			return false;
		}
	
	
	}

	public Long getIdUser(String token) {
		Claims claims = Jwts.parser().setSigningKey(this.secret).parseClaimsJws(token).getBody();		
		return Long.parseLong(claims.getSubject());
	}

}
