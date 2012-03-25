package br.com.dao;

import java.util.List;

import org.hibernate.HibernateException;

import br.com.bean.Professor;


/**
 * @author Camilo
 * Observe a vantagem de se extends DAO. Code clear sem duplicação. 
 */
public class ProfessorDAO extends DAO {
	
	public ProfessorDAO() {
		// TODO Auto-generated constructor stub
	}
		//salvando o objeto 
	public void salvar(Professor professor){
		try{
		begin();	
		getSession().save(professor);
		commit();
		}catch (HibernateException e) {
			rollback();
		}	}
	
	//obtendo a lista de professores usando HQL
	public List todosProfs(){
		List list = getSession().createQuery("from Professor").list();
		return list; 
	}
}
