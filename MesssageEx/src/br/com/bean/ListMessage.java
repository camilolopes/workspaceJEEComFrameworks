package br.com.bean;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//classe que lista as mensagem que estao no BD
public class ListMessage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory(); 
		Session session = factory.openSession(); 
		
		List message = session.createQuery("from Message").list(); 
		System.out.println("found " + message.size() + " message(s):");
		for(Object l : message){
			Message msg = (Message)l; 
			System.out.println(msg.getMessage());
		}
	}

}
