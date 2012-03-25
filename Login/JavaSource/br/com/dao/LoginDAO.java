package br.com.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import br.com.bean.Login;

public class LoginDAO extends DAO {
	
	public LoginDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public void salvar(Login login){
		try{
		begin(); 
		getSession().save(login);
		commit();
		}catch (HibernateException e) {
			rollback();			
		}
	}
	
	public boolean verificarLogin(String login, String senha){		 
		Query query = getSession().createQuery("from Login  where login =:login and senha=:senha");
		query.setString("login", login);
		query.setString("senha", senha);
		Login log = (Login) query.uniqueResult();
		System.out.println(log);		
		if(log!=null){
			return true;
		}
		return false;
	}
	
	public List exibirTodos(){
		Query query = getSession().createQuery("from Login"); 
		List list = query.list(); 		
		return list;
	}
	
}
