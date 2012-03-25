package br.com.controller;

import br.com.bean.Universidade;
import br.com.dao.UniversidadeDAO;

/**
 * @author Camilo
 * Classe controladora para o bean Universidade 
 * Ela se comunica com o forumuni.jsp 
 */
public class ControlerUni {
	//precisamos desta instância para acessar o bean
private Universidade universidade; 
//criamos sempre um novo objeto quando a classe é invocada	
public ControlerUni() {
		 universidade = new Universidade(); 
	}
	public String salvar(){
		UniversidadeDAO unidao = new UniversidadeDAO(); 
		unidao.salvar(universidade);//passando o objeto para o salvar da persistência
		return "salvaruni"; 
	}
	public Universidade getUniversidade() {
		return universidade;
	}
	public void setUniversidade(Universidade universidade) {
		this.universidade = universidade;
	}
}
