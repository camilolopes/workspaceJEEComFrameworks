package br.com.controller;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import br.com.bean.Professor;
import br.com.dao.ProfessorDAO;

/**
 * @author Camilo
 *Classe que controla as ações do professor, aqui salvamos um professor no BD
 *recuperamos os professores cadastro e cadastramos em um Map 
 * para futuramente carregar em menu no nosso form em JSF.
 */
public class ControllerProf {
	private Professor professor; 
	private DataModel model;
	
	/* aqui temos um Map que armazena os professores cadastrados
	 * fizemos isso para usar esse map em um selectOneMenu no nosso formulário em JSF
	 */
	private Map<String,Object> categoriaitem=null;
	
	public ControllerProf() {
	 professor = new Professor();
	}
	
	public String salvar(){
		ProfessorDAO profdao = new ProfessorDAO(); 
		
			profdao.salvar(professor);
		
		return "salvar"; 
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	/* obtendo os professores do BD
	 * usamos esse resultado para exibir uma tabela com 
	 * todos os professores cadastrados
	 */
	public DataModel getTodos(){
		ProfessorDAO profdao = new ProfessorDAO(); 
			model = new ListDataModel(profdao.todosProfs()); 
		return model; 
	}
	//obtendo os professores do BD e adicionado em um Map
	public Map<String,Object> getCategorias(){
		ProfessorDAO profdao = new ProfessorDAO();
		categoriaitem = new LinkedHashMap<String, Object>();
		for(Iterator iter = profdao.todosProfs().iterator();iter.hasNext();){
			Professor p = (Professor)iter.next(); //pegando o objeto professor
			categoriaitem.put(p.getNome(), p.getNome()); //cadastrando o rotulo e valor nome
			//atenção o valor nome adicionado é o que será cadastrado no BD
		}
		return categoriaitem;
	}
	
	/*método que vai criar um novo objeto bean, quando
	 * clicar no botão novo no form JSF. criamos uma nova instância 
	 * para "zerar" os valores do bean professor 
	 */
	public String novocadastro(){	
		professor = new Professor();
		return "novo"; 
	}
	
}
