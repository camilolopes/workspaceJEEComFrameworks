package br.com.dao;

import java.util.List;

import org.hibernate.HibernateException;

import br.com.bean.LoginFuncao;

public class LoginFuncaoDAO extends DAO {
	
	public LoginFuncaoDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public void salvar(LoginFuncao loginfuncao){	
		try{
		begin();
		getSession().save(loginfuncao); 
		System.out.println("salvo");
		getSession().getTransaction().commit();
		}catch (HibernateException e) {
			rollback();
		}finally{
			close();
		}
	}
	//retorna todas as funcoes cadastradas
	public List listaFuncao(){		
		List list = getSession().createQuery("from LoginFuncao").list();		
		return list;
	}
}
