package br.com.teste;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.com.bean.Message;

public class PopulaMessage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session = factory.openSession(); 
			session.beginTransaction(); 
		Message m1 = new Message("lopes"); 
			session.save(m1);//salvando o objetos persistenced 
			session.getTransaction().commit();
			session.close();
		System.out.println("Salvo com sucesso no banco de dados");

	}

}
