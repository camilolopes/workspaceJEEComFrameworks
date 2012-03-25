package br.com.camilolopes.controlador;

import br.com.camilolopes.bean.Usuario;

public class Controller {
	//representa nosso bean
	private Usuario usuario; 	
	
	public Controller() {
		usuario = new Usuario();
	}
	
	public String exibir(){
		
		return "exibirusuario";
	}
	//gets/sets
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
