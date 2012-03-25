package br.com.camilolopes.controlador;

import br.com.camilolopes.bean.UsuarioEmail;

public class UsuarioController {
	private UsuarioEmail usuarioemail; 
	
	public UsuarioController() {
		usuarioemail = new UsuarioEmail();
	}

	public String cadastrar(){
		
		return "cadastrarusuario";
	}
	
	public UsuarioEmail getUsuarioemail() {
		return usuarioemail;
	}

	public void setUsuarioemail(UsuarioEmail usuarioemail) {
		this.usuarioemail = usuarioemail;
	}
	
}
