package br.com.zup.config.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import br.com.zup.entities.User;
import br.com.zup.repository.UserRepository;

public class AutenticacaoViaTokenFilter extends OncePerRequestFilter {
	
	private TokenService tokenService;
	
	private UserRepository userRepository;
	
	

	public AutenticacaoViaTokenFilter(TokenService tokenService, UserRepository userRepository) {
		this.tokenService = tokenService;
		this.userRepository = userRepository;
	}
	/**
	 * Peguei o id do token, recuperei o objeto usuário passando o id, criei o usernameauthenticationtoken passando o usuário, 
	 * passando nulo na senha, porque não preciso dela, passando os perfis, e aí por fim chamei a classe do Spring que força a autenticação. 
	 * Essa autenticação é só para esse request. Na próxima requisição ele vai passar no filter de novo, pegar o token e fazer todo o processo. 
	 * A autenticação é stateless. Em cada requisição eu reautentico o usuário só para executar aquela requisição.
	 */
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		String token = recuperarToken(request);
		boolean valido = tokenService.isTokenValido(token);
		if(valido) {
			autenticarLogin(token);
		}
		
		filterChain.doFilter(request, response);
		
	}
	/**
	 * A API REST não guarda estado de autenticação, então a cada request eu mando o token, reautentico. 
	 * Fica mais leve, mais fácil de ter escalabilidade na nossa API.
	 * 
	 */
	//Spring, autentique usuário
	private void autenticarLogin(String token) { 
		Long idUser =  tokenService.getIdUser(token);
		User user = userRepository.getOne(idUser);
		UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
		SecurityContextHolder.getContext().setAuthentication(authentication);
		
	}

	private String recuperarToken(HttpServletRequest request) {
		String token = request.getHeader("Authorization");
		if (token == null || token.isEmpty() || !token.startsWith("Bearer ")) {
		return null;
	}
	return token.substring(7, token.length());
	}

	
}