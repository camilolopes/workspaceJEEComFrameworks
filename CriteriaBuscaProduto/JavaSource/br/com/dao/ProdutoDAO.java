package br.com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import br.com.bean.Produto;

public class ProdutoDAO extends DAO {

	public List<Produto> buscarTodos(){
		Criteria crit = getSession().createCriteria(Produto.class); 
		List<Produto> lista = crit.list();		
		return lista;
	}
	
	public List<Produto> buscarEq(String nome){
		Criteria crit = getSession().createCriteria(Produto.class); 
			crit.add(Restrictions.eq("nome", nome));
			List<Produto> lista = crit.list();
		return lista;
	}
	
	public List<Produto> buscarlike(String nome){
		Criteria crit = getSession().createCriteria(Produto.class); 
			crit.add(Restrictions.like("nome", nome+"%")); 
		List<Produto> lista = crit.list(); 
		return lista;
	}
	
	public List<Produto> buscarany(String nome){ 
		Criteria crit = getSession().createCriteria(Produto.class); 
			crit.add(Restrictions.like("nome", nome, MatchMode.ANYWHERE));
			List<Produto> lista = crit.list();		
		return lista; 
	}
	public List<Produto> buscarge(int qtde){
		Criteria crit = getSession().createCriteria(Produto.class); 
			crit.add(Restrictions.ge("quantidade", qtde));
		List<Produto> lista = crit.list();
		return lista;
	}
	//ordena em ordem ascendente - alfabetica por nome
	public List<Produto> ordernomeasc(){
		Criteria crit = getSession().createCriteria(Produto.class); 
		crit.addOrder(Order.asc("nome")); 
		List<Produto> lista = crit.list(); 
		return lista;
	}
	//ordena em ordem descendente por qtde em estoque 
	public List<Produto> orderqtdedesc(){
		Criteria crit = getSession().createCriteria(Produto.class); 
			crit.addOrder(Order.desc("quantidade")); 
			List<Produto> lista = crit.list();
		return lista;
	}
	
	public Integer projecaosoma(String opcao){
		Criteria crit = getSession().createCriteria(Produto.class); 
		if(opcao.equals("soma")){
			crit.setProjection(Projections.sum("quantidade")); 
		}else if (opcao.equals("maiorprod")) {
			crit.setProjection(Projections.max("quantidade"));
		}		
		return (Integer) crit.uniqueResult();
	}
	
}
