package br.com.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DAO {
	private static final ThreadLocal threadlocal = new ThreadLocal(); 
	private static final SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
	
	//criando/verificando minha session 
	public static Session getSession(){
		Session session = (Session) threadlocal.get(); 
		if(session == null){
			session = sessionfactory.openSession(); 
			threadlocal.set(session);
		}
		return session;
	}
	public void begin(){
		getSession().beginTransaction();
	}
	public void commit(){
		try{
		getSession().getTransaction().commit();
		
		} catch (HibernateException e) {
			e.printStackTrace(); 
		getSession().beginTransaction().rollback();
		}
	}
	
	public void rollback(){
		try{
			getSession().getTransaction().rollback();
		}catch (HibernateException e) {
			e.printStackTrace();
		}
		threadlocal.set(null);
	}
	
	public void close(){
		getSession().close();
		threadlocal.set(null);
	}
}
