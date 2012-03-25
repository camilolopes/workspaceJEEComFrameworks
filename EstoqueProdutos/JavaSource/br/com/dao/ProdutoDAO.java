package br.com.dao;

import java.util.List;

import org.hibernate.Query;

import br.com.bean.Produto;

public class ProdutoDAO extends DAO {
	
	public void salvar(Produto produto){
		begin(); //inicia a transacao 
		getSession().save(produto);
		commit(); 
		getSession().flush();	}
	
	public List listarProduto(){
		String hql = "from Produto"; 
		Query query = getSession().createQuery(hql); 
		List list = query.list();
		return list;
	}
	
	public List buscarProduto(String produto){
		String hql = "from Produto p where p.nomeProduto like:produto" ;
		Query query = getSession().createQuery(hql); 
		List list = query.setString("produto", "%"+produto+"%").list();
		return list; 
		
	}}
