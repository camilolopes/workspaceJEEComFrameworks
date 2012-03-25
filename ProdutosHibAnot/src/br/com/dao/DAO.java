package br.com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class DAO {
	private static final ThreadLocal<Session> threadlocal = new ThreadLocal<Session>();
	/* usamos AnnotationsConfiguration
	 * assim a leitura do bean será apontada para as anotações
	 * e não para os mapeamentos .hbm.xml
	 */
	private static final SessionFactory sessionfactory = new AnnotationConfiguration().configure().buildSessionFactory();
	
	public static Session getSession(){
		Session  session = threadlocal.get();
		if (session ==null) {
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
