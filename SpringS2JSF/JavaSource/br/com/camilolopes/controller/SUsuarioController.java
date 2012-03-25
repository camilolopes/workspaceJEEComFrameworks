package br.com.camilolopes.controller;

import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import br.com.camilolopes.bean.SUsuario;
import br.com.camilolopes.dao.SUsuarioDAO;

public class SUsuarioController {
	private SUsuario usuario;
	private DataModel model; 
	
	public SUsuarioController() {
		usuario = new SUsuario();
	}
	
	public DataModel getTodosUser(){
		SUsuarioDAO suserdao = new SUsuarioDAO();
		model = new ListDataModel(suserdao.listaUsuarios());
		return model;
	}
	

	public SUsuario getUsuario() {
		return usuario;
	}

	public void setUsuario(SUsuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}
