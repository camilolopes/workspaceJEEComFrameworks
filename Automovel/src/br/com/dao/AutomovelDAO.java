package br.com.dao;

import org.hibernate.HibernateException;
import br.com.bean.Automovel;

public class AutomovelDAO extends DAO { 
	
	public AutomovelDAO() {
		// TODO Auto-generated constructor stub
	}
	//m�todo respons�vel por fazer a persistencia e salvar no BD
	public void salvar(Automovel automovel){ 
		begin(); 
		getSession().save(automovel);
		try{
		commit();//ele sabe que deve manter a sessao devido o if do m�todo getSession()
		System.out.println("Automovel Cadastrado com sucesso");
		}catch (HibernateException e) {
			rollback();
		}
	}}
