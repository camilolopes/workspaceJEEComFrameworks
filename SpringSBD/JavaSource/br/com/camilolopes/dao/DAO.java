package br.com.camilolopes.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class DAO {
	private SessionFactory sessionfactory = new AnnotationConfiguration().configure().buildSessionFactory();
	private ThreadLocal threadlocal = new ThreadLocal();
	
	public Session getSession(){
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
		getSession().close();
	}
}
