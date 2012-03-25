package br.com.dao;

import org.hibernate.HibernateException;
import br.com.bean.Universidade;

public class UniversidadeDAO extends DAO {
	
	public UniversidadeDAO() {
		
	}	
	public void salvar(Universidade universidade){ 
		try{
		begin();
		getSession().save(universidade);
		commit();
		close();
		}catch (HibernateException e) {
			rollback();//cancela o commit em caso de erro
			e.printStackTrace();
		}}	
}//fim da classe
