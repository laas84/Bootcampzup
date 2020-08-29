package br.com.zup.form;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class LoginForm {
	
	private String login;
	private String senha;
	
	 
	public String getLogin() {
		return login;
	}
	public String getSenha() {
		return senha;
	}
	public void setEmail(String login) {
		this.login = login;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public UsernamePasswordAuthenticationToken converter() {
		return new UsernamePasswordAuthenticationToken(login, senha);
	}
	
}