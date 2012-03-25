package br.com.camilolopes.controlador;

import java.util.List;

import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import br.com.camilolopes.bean.UsuarioEmail;
import br.com.camilolopes.dao.UserEmailDAO;

public class UsuarioController {
	private UsuarioEmail usuarioemail;
	private DataModel model;
	private List lista; 
	
	public UsuarioController() {
		usuarioemail = new UsuarioEmail();
	}

	public String cadastrar(){
		UserEmailDAO usdao = new UserEmailDAO(); 
			usdao.cadastrar(usuarioemail);
			lista = usdao.listaUsuarios();
		return "cadastrarusuario";
	}
	//armazena uma lista de dados
	public DataModel getTodos(){		
		model = new ListDataModel(lista);
		return model; 
	}
	public UsuarioEmail getUsuarioemail() {
		return usuarioemail;
	}

	public void setUsuarioemail(UsuarioEmail usuarioemail) {
		this.usuarioemail = usuarioemail;
	}
	
}
