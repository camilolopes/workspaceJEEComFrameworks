package br.com.camilolopes.controlador;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import com.sun.org.apache.regexp.internal.recompile;

import br.com.camilolopes.bean.Usuario;

public class Controller {
	//representa nosso bean
	private Usuario usuario; 	
	
	public Controller() {
		usuario = new Usuario();
	}
	
	public String exibir(){
		boolean teste = true; 
		FacesContext context = FacesContext.getCurrentInstance();
		if(usuario.getNome()!=null){
			for(int i=0; i < usuario.getNome().length();i++){
				char c = usuario.getNome().charAt(i);
				if(!Character.isLetter(c)){
					String mensagem = "Somente letras são permitidos";
				FacesMessage msg = new FacesMessage(mensagem);
				context.addMessage("formulario", msg);
					teste = false;
					break;	}
			}
		}else{
			teste = false;
		}
		return (teste ? "exibirusuario" : "invalido" );
	}
	//gets/sets
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
