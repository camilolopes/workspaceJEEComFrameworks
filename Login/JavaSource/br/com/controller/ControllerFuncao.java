package br.com.controller;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import br.com.bean.LoginFuncao;
import br.com.dao.LoginFuncaoDAO;

public class ControllerFuncao {
	 private LoginFuncao loginfuncao; 
	 private DataModel model;
	 private Map<String, Object> funcaoitem = null;
	
	 //construtor da classe
	public ControllerFuncao() {
		loginfuncao = new LoginFuncao();
	}
	
	public String salvarfuncao(){
			LoginFuncaoDAO loginfuncaodao = new LoginFuncaoDAO(); 
				loginfuncaodao.salvar(loginfuncao);
		return "salvarfuncao"; 
	}
	//gets/sets
	public LoginFuncao getLoginfuncao() {
		return loginfuncao;
	}
	public void setLoginfuncao(LoginFuncao loginfuncao) {
		this.loginfuncao = loginfuncao;
	}

/*preenche o selectitem com as funcoes
 * que vem de uma List que pega do BD
 * Sendo assim temos um selectitem dinâmico
 */
	public Map<String, Object> getFuncao() {
		funcaoitem = new LinkedHashMap<String, Object>();
		LoginFuncaoDAO logindao = new LoginFuncaoDAO();
		for (Iterator<?> iterator = logindao.listaFuncao().iterator(); iterator.hasNext();) {
			LoginFuncao loginfuncao = (LoginFuncao) iterator.next();
			//colocando as funções no meu conjunto
			funcaoitem.put(loginfuncao.getFuncao(), loginfuncao.getFuncao());
		}
		return funcaoitem;
	}
	
}
