package br.com.teste;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.com.bean.Produto;

public class ProdutoTeste {

	public static void main(String[] args) {
		//criando o objeto session
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession(); 
		Produto iphone = new Produto("IPhone", 100);
		Produto blackberry = new Produto("BlackBerry", 50); 
		Produto n98 = new Produto("n98 nokia", 20); 
		Produto nexone = new Produto("nexone", 200);
		//abrindo a transação 
		session.beginTransaction();
		//session.save(iphone);
		//session.save(blackberry); 
	//	session.save(n98);
		//session.save(nexone);
		//session.getTransaction().commit();
		//exibirProdutos(session);
		//alias(session);
	//	operadores(session);
		//delete(session);
	//	ordernando(session);
	//	somar(session);
	//	atualizar(session);
	}
	public static void exibirProdutos(Session session){ 
		Query query = session.createQuery("from Produto");
		 List<Produto> lista = query.list();
		 for (Produto produto : lista) {
			System.out.println(produto.getNome());
		}
	}
	
	public static void alias(Session session){
		Query query = session.createQuery("select p.nome from Produto as p");
		List<String> lista = query.list(); 
		for (String produto : lista) {
			System.out.println(produto);
		}
	}
	public static void operadores(Session session){
			Query query = session.createQuery("from Produto " +
					"as p where p.quantidade >=50");
			List<Produto> lista = query.list(); 
		for (Produto produto : lista) {
			System.out.println(produto.getNome());
		}
	}
	public static void delete(Session session){
		Query query = session.createQuery("delete from Produto where quantidade = :qtde"); 
		query.setInteger("qtde", 0); 
		query.executeUpdate();
		session.getTransaction().commit();
		
	}
	public static void ordernando(Session session){
		String hql = "from Produto as p order by p.nome asc";
		Query query = session.createQuery(hql); 
		List<Produto> lista = query.list(); 
		for (Produto produto : lista) {
			System.out.println(produto.getNome());
		}
	}
	public static void somar(Session session){
		String hql = "select sum(prod.quantidade) from Produto as prod"; 
		Query query = session.createQuery(hql); 
			List<Long> lista = query.list();	
			for (Long total : lista) {
				System.out.println(total);
			}			
			}
	public static void atualizar(Session session){
		String hql = "update Produto set nome = :novonome where nome = :nome";
		Query query = session.createQuery(hql);
			query.setString("nome", "IPhone"); 
			query.setString("novonome", "Iphone 4G");
			int linha = query.executeUpdate();
			System.out.println("linha atualizada " + linha);
			
	}
	public static void unico(Session session){
		String hql = "from Produto where quantidade > 100"; 
		Query query = session.createQuery(hql);
		Produto prod = (Produto) query.uniqueResult();
		/*se tiver mais de um produto com a quantidade
		 * maior que 100 veremos uma exceção
		 */}
	}
//fim da classe


