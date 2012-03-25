package br.com.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Camilo
 * Nossa classe DAO responsavel por fazer a persistencia com BD e salvar as informações
 * de um bean persistido. 
 * A vantagem de separar a persitencia do BeanDAO é simplesmente para evitar 
 * códigos duplicados. Então sempre que precisamos persistir um objeto basta
 * extends DAO e pronto. 
 */
public class DAO {
	private static final SessionFactory sessionFactory = new Configuration().configure()
	.buildSessionFactory();
	private static final ThreadLocal threadlocal = new ThreadLocal();
	
	public DAO() {
		// TODO Auto-generated constructor stub
	}
	
	public static Session getSession(){
		Session session = (Session)threadlocal.get();
		if(session == null){
			session = sessionFactory.openSession();
			threadlocal.set(session);
		}
		return session;
	}
	
	public void begin(){
		getSession().beginTransaction();
	}
	
	public void commit(){
		getSession().beginTransaction().commit();
	}
	public void rollback(){
		try{
		getSession().beginTransaction().rollback();
		
	}catch (HibernateException e) {
		e.printStackTrace();
	}
	
	try{
		getSession().close();
	}catch (HibernateException e) {
		e.printStackTrace();
	}
	threadlocal.set(null);
	}
	public static void close(){
		getSession().close();
		threadlocal.set(null);
	}
}
