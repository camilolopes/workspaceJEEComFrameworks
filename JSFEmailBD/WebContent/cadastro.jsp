<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title></title>
	</head>
	<body>
		<f:view>
		<h:form>
			Nome:<br/>
			<h:inputText id="nome" size="30" value="#{usuarioController.usuarioemail.nome}" required="true"
			 requiredMessage="Campo obrigatório" />
			 <h:message for="nome"/>
			 <br/>
			 Sobrenome:<br/>
			 <h:inputText id="sobrenome" size="30" value="#{usuarioController.usuarioemail.sobrenome}" required="true"
			 requiredMessage="Campo obrigatório" />
			 <h:message for="sobrenome"/><br/>
			 E-mail:<br/>
			 <h:inputText id="email" size="40" value="#{usuarioController.usuarioemail.email}" 
			 required="true" requiredMessage="Campo obrigatório" >
			 	<f:validator validatorId="validaemail"/>
			 </h:inputText>
			 <h:message for="email"/><br/>
			 <h:commandButton value="Cadastrar" action="#{usuarioController.cadastrar}" type="submit"/>
		</h:form>
		</f:view>
	</body>	
</html>  
