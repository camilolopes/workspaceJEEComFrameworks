package br.com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//criando no classe DAO Generica 
/* aqui temos tudo que precisamos begin(), commit() etc
 * A classe que precisar dessas funcionalidades para 
 * extends ao DAO.
 */
public class DAO {
	private static final ThreadLocal threadlocal = new ThreadLocal(); 
	private static final SessionFactory sessionfactory = new Configuration().configure().
	buildSessionFactory();
	
	public DAO() {
		// TODO Auto-generated constructor stub
	}
	
	public static Session getSession(){
				Session session = (Session) threadlocal.get();
				/* este teste é crucial, pois quando uma sessao já existir 
				 * ele não cria, e retorna o objeto session 
				 */
				if (session == null){
					session = sessionfactory.openSession();
					threadlocal.set(session);
				}
		return session;	}
	
	/* observe que criamos os metodos com o mesmo nome dos
	 * metodos que temos no Hibernate. Isso para facilitar 
	 * durante a manutencao e leitura. Porém, não ache que isso
	 * seja uma subscrição ou algo semelhante. 
	 */
	public void begin(){
		getSession().beginTransaction(); 		
	}
	
	public void commit(){
		getSession().getTransaction().commit(); 
	}
	public void rollback(){
		getSession().getTransaction().rollback();
	}
	public static void close(){
		getSession().clear();
		threadlocal.set(null);
	}
}
