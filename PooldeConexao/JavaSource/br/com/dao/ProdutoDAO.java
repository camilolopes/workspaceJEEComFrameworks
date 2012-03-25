package br.com.dao;

import org.hibernate.HibernateException;

import br.com.bean.Produto;

public class ProdutoDAO extends DAO {
	
	
	public ProdutoDAO() {
	
	}
	
	public void salvar(Produto produto){
		try{
		begin(); 
		getSession().save(produto);
		commit(); 
		}catch (HibernateException e) {
			e.printStackTrace(); 
			rollback();
		}finally{
			close();
		}
	}
}
