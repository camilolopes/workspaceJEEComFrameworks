package br.com.main;

import org.hibernate.HibernateException;

import br.com.bean.Produto;
import br.com.dao.DAO;

public class ProdutoMain extends DAO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 new ProdutoMain().cadastrarProduto();

	}
	public void cadastrarProduto(){
		Produto produto = new Produto();
		produto.setNome("Samsung Star"); 
		produto.setQuantidade(10); 
	try{
		begin(); 
		getSession().save(produto);
		commit();		
	}catch (HibernateException e) {
		e.printStackTrace();
		rollback();		
	}
		
	}
}
