package br.com.camilolopes.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class SUsuario {
	@Id
	private int id; 
	@Column
	private String login;
	@Column
	private String senha;
	@Column
	private String tipoacesso;
	public SUsuario() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTipoacesso() {
		return tipoacesso;
	}
	public void setTipoacesso(String tipoacesso) {
		this.tipoacesso = tipoacesso;
	}
	
	
}
