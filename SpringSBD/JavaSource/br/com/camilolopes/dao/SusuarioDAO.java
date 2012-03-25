package br.com.camilolopes.dao;



import org.hibernate.HibernateException;

import br.com.camilolopes.bean.Susuario;

public class SusuarioDAO extends DAO {
	
	public void cadastrar(Susuario us){
		try{
			begin();
			getSession().save(us);
			commit();
			getSession().flush();
		}catch (HibernateException e) {
			e.printStackTrace();
			rollback();
		}
	}	
	
}
