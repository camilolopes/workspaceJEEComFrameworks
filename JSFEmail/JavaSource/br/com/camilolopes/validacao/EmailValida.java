package br.com.camilolopes.validacao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
//importacoes dos pacotes
public class EmailValida implements Validator {
	@Override
	public void validate(FacesContext context, UIComponent componente, Object objeto)
			throws ValidatorException {
		//recebe o que foi digitado
		String emaildigitado = (String) objeto;
		//faz a valida��o do email usando regex
		Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
		Matcher m = p.matcher(emaildigitado);
		boolean valida = m.matches(); 
		if(!valida){
			FacesMessage mensagem = new FacesMessage();
			//em caso de ser inv�lido,o usu�rio recebe esta mensagem
				mensagem.setDetail("Email inv�lido");
				mensagem.setSummary("E-mail inv�lido");
				mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
				throw new ValidatorException(mensagem);
		}}
	}
