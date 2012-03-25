package br.com.camilolopes.dao;

import java.util.List;

import org.hibernate.Criteria;

import br.com.camilolopes.bean.SUsuario;

public class SUsuarioDAO extends DAO {
	
	
	public List listaUsuarios(){
		Criteria crit = getSession().createCriteria(SUsuario.class);
			List lista = crit.list();		
		return lista; 
	}
}
