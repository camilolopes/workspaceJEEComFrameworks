<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title></title>
	</head>
	<body>
	<fieldset><legend>Cadastro Usuários</legend>
		<f:view>
			<h:form >
			<h:panelGrid>			
			<tr><h:outputText value="Nome:" /><td><h:inputText id="nome" value="#{controllerLogin.login.nome}" /></td></tr>			
			<tr><h:outputText value="Login:" /><td><h:inputText id="login" value="#{controllerLogin.login.login}" /></td></tr>
			<tr><h:outputText value="Senha:" /><td><h:inputSecret size="12" id="senha" value="#{controllerLogin.login.senha}" /></td></tr>
			<tr><h:outputText value="Função:" /><td>
			<h:selectOneMenu value="#{controllerLogin.login.funcao}">
					<f:selectItems value="#{controllerFuncao.funcao}"/>
					</h:selectOneMenu>
					</td>
			</tr>
				</h:panelGrid>	
				<h:commandButton value="Cadastrar" action="#{controllerLogin.salvar}" 
			type="submit"/>&nbsp;
		<h:commandButton  type="submit" value="Cancelar" action="cancelar" /> 			
			</h:form>
		</f:view>
		</fieldset>
	</body>	
</html>  
