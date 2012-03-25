package br.com.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DAO {
	private static SessionFactory sessionfactory = new 
	Configuration().configure().buildSessionFactory();
	
	private static ThreadLocal threadlocal = new ThreadLocal();
	
	public static Session getSession(){
		Session session = (Session) threadlocal.get(); 
		if(session==null){
			session = sessionfactory.openSession(); 
			threadlocal.set(session); 
		}
		return session;  
	}
	
	public void begin(){
		getSession().beginTransaction(); 
	}
	
	public void commit(){
		getSession().getTransaction().commit();
	}
	
	public void rollback(){
		getSession().getTransaction().rollback(); 
	}
	public void close(){
		try{
		getSession().close();
		}catch (HibernateException e) {
			e.printStackTrace();
		}
	}
}
