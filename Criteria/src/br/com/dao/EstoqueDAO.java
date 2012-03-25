package br.com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Conjunction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.AliasToBeanResultTransformer;

import br.com.bean.Estoque;

public class EstoqueDAO extends DAO {
	 

	//exibindo todos produtos no estoque
	public List<Estoque> getTodos(){
		Criteria crit = getSession().createCriteria(Estoque.class);
			List<Estoque> lista = crit.list();
		return lista;
	}
	
	public List<Estoque> buscaProd(){
		Criteria crit = getSession().createCriteria(Estoque.class); 
			crit.add(Restrictions.eq("nomeProduto", "blackberry"));
			List<Estoque> lista = crit.list();		
		return lista;
	}
	/* pesquisa o produto que leva a palavra
	 * black na string
	 */
	public List<Estoque> buscaProdlike(){
		Criteria crit = getSession().createCriteria(Estoque.class); 
			crit.add(Restrictions.like("nomeProduto", "black%")); 
			List<Estoque> lista = crit.list();
		return lista;
	}
	/*buscando no final da string */
	public List<Estoque> buscaProdEndLike(){
		Criteria crit = getSession().createCriteria(Estoque.class); 
			crit.add(Restrictions.like("nomeProduto", "host", MatchMode.END));
			List<Estoque> lista = crit.list();
			return  lista;
	}
	//retorna os produtos com o valor > 600
	public List<Estoque> buscaProdPreco(){
			Criteria crit = getSession().createCriteria(Estoque.class); 
				crit.add(Restrictions.ge("valorProduto", new Double(600.0)));
			List<Estoque> lista = crit.list();
	return 	lista;
	}
	//usando OR na busca
		public List<Estoque> buscaProdOr(){
			Criteria crit = getSession().createCriteria(Estoque.class); 
			Criterion preco = Restrictions.gt("valorProduto", new Double(900.0));
			Criterion nomeprod = Restrictions.like("nomeProduto", "black%"); 
			LogicalExpression logOR = Restrictions.or(preco, nomeprod);
			List<Estoque> lista = crit.add(logOR).list();		
			return lista;
		}
	//usando AND na busca
	public List<Estoque> buscaProdAnd(){
		Criteria crit = getSession().createCriteria(Estoque.class); 
		crit.add(Restrictions.gt("valorProduto", new Double(200.0))); 
		crit.add(Restrictions.like("nomeProduto", "black%"));
		List<Estoque> lista = crit.list();
		return lista;
	}
	
	/*usando disjunction para mais de uma 
	 * possibilidade com OR	 */
	public List<Estoque> buscaProdDisjuction(){
		Criteria crit =  getSession().createCriteria(Estoque.class); 
		Criterion preco = Restrictions.gt("valorProduto", new Double(1000.0)); 
		Criterion nome = Restrictions.like("nomeProduto", "black%"); 
		Criterion qtde = Restrictions.gt("qtde", new Integer(100));
		Disjunction dis = Restrictions.disjunction(); 
			dis.add(preco);
			dis.add(nome); 
			dis.add(qtde);
		crit.add(dis);
		List<Estoque> lista = crit.list();
		return lista;
	}
	/* usando conjuction para mais de uma possibilidade
	 * com AND.
	 */
	public List<Estoque> buscaProdConjuction(){
			Criteria crit = getSession().createCriteria(Estoque.class); 
			Criterion preco = Restrictions.ge("valorProduto", new Double(600.0)); 
			Criterion qtde = Restrictions.gt("qtde", new Integer(5)); 
			Criterion nome = Restrictions.like("nomeProduto", "one", MatchMode.ANYWHERE);
			Conjunction conj = Restrictions.conjunction(); 
				conj.add(nome);
				conj.add(preco);
				conj.add(qtde);
			crit.add(conj); 
			List<Estoque> lista = crit.list(); 
		return lista; 
	}
	//ordenado o resultado da busca
	public List<Estoque> ordenaProd(){
		Criteria crit = getSession().createCriteria(Estoque.class); 
			crit.addOrder(Order.asc("nomeProduto"));
		 List<Estoque> lista = crit.list(); 
		return lista;
	}
	//usando projecoes 
	public List projecaoProd(){
		Criteria crit = getSession().createCriteria(Estoque.class); 
			crit.setProjection(Projections.avg("valorProduto")); 
		List lista = crit.list();		
	return 	lista;
	}
	//somando o estoque
	public Double projecaoSum(){
		Criteria crit = getSession().createCriteria(Estoque.class);
		crit.setProjection(Projections.sum("valorProduto"));  
		return (Double) crit.uniqueResult();
	}
	//retorna uma lista de projecoes 
	/*O produto mais caro no estoque
	 * O produto mais barato no estoque
	 * E o total em estoque
	 */
	public List projecaoProdLista(){
		Criteria crit = getSession().createCriteria(Estoque.class); 
		ProjectionList projlist = Projections.projectionList(); 
			projlist.add(Projections.max("valorProduto")); 
			projlist.add(Projections.min("valorProduto")); 
			projlist.add(Projections.sum("valorProduto"));
		crit.setProjection(projlist); 
		List lista = crit.list();
		return lista;
	}
	//retorna apenas algumas propriedades nome do produto + qtde
	public List projecaoProdProp(){
			Criteria crit = getSession().createCriteria(Estoque.class); 
			ProjectionList projlist = Projections.projectionList(); 
				projlist.add(Projections.property("nomeProduto")); 
				projlist.add(Projections.property("qtde"));				
			crit.setProjection(projlist); 
			List lista = crit.list();
		return lista;
	}
}
