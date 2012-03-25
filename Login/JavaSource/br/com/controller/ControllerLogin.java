package br.com.controller;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import br.com.bean.Login;
import br.com.dao.LoginDAO;

public class ControllerLogin {
	private Login login; 
	private DataModel model; 
	
	public ControllerLogin() {
		login = new Login(); 
	}
	
	public String salvar(){
			LoginDAO logindao = new LoginDAO(); 
				logindao.salvar(login);
		return "salvar"; 
	}
	
	/*criamos uma nova instância
	 * para um novo usuário
	 */
	public String novologin(){
			login = new Login();
		return "cadastrarlogin"; 
	}
	/*obtém todos os usuarios e passamos esse método
	 * para um DataTable no JSF que tem como objetivo
	 * exibir todos os usuários cadastrados
	 */
	public DataModel getExibirLogin(){
		LoginDAO logindao = new LoginDAO(); 
			model = new ListDataModel(logindao.exibirTodos());		
		return model; 
	}
	/*verifica se o login/senha são válidos  
	 * login/senha inválido o usuário recebe uma mensagem 
	 * na página atual */
	public String verificarlogin(){
		LoginDAO logindao = new LoginDAO(); 
		FacesContext context = FacesContext.getCurrentInstance();
			boolean result = logindao.verificarLogin(login.getLogin(), login.getSenha());
			System.out.println(result);
			if(!result){
				String msg = "Login/Senha inválido";
				FacesMessage message = new FacesMessage(msg);
				context.addMessage("formulario", message);
				return "logininvalido";	
				}			
		return "logvalido";
	}
	//gets/sets
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	
}
