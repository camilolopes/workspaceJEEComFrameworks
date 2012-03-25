<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title></title>
	</head>
	<body>
	<fieldset> <legend>Login</legend>
		<f:view>
			<h:form id="formulario">
				<h:panelGrid border="0">
				<h:column>
					<h:outputText>Login</h:outputText>
				</h:column>
				<h:column>
					<h:inputText id="login" size="30" value="#{controllerLogin.login.login}" 
					/>
				</h:column>
				<h:column>
					<h:outputText>Senha:</h:outputText>
				</h:column>
				<h:column>
					<h:inputSecret id="senha" value="#{controllerLogin.login.senha}"					/>
					<h:commandButton id="logar" type="submit" value="Acessar" action="#{controllerLogin.verificarlogin}" />
				</h:column>
				<h:messages/>
				</h:panelGrid>
			</h:form>
		</f:view>
		</fieldset>
	</body>	
</html>  
