package br.com.camilolopes.controller;

import br.com.camilolopes.bean.Susuario;
import br.com.camilolopes.dao.SusuarioDAO;

public class UsuarioController {
	private Susuario usuario; 
	
	public UsuarioController() {
			usuario = new Susuario();
	}
	
	public String cadastrar(){
			SusuarioDAO usdao = new SusuarioDAO(); 
				usdao.cadastrar(usuario);
		return "cadastrarus";
	}
	

	public Susuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Susuario usuario) {
		this.usuario = usuario;
	}
	
}
