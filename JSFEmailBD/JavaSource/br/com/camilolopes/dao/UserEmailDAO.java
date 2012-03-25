package br.com.camilolopes.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;

import br.com.camilolopes.bean.UsuarioEmail;

public class UserEmailDAO extends DAO {
	private UsuarioEmail usuarioemail; 
	
	public void cadastrar(UsuarioEmail usuario){
		try{
			begin();
			getSession().save(usuario);
			commit();
		}catch (HibernateException e) {
			e.printStackTrace();
			rollback();
		}
	}
	//retorna todos os usuários cadastrados
	public List listaUsuarios(){
		Criteria crit = getSession().createCriteria(UsuarioEmail.class);
		List listausers = crit.list();		
		return listausers; 
	}
	public UsuarioEmail getUsuarioemail() {
		return usuarioemail;
	}

	public void setUsuarioemail(UsuarioEmail usuarioemail) {
		this.usuarioemail = usuarioemail;
	}
	
	
}
