<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title></title>
	</head>
	<body>
		<f:view>
			<b>Cadastro de Users</b>		
			<h:form>Login:
			<h:inputText id="login" size="30" value="#{usuarioController.usuario.login}" />
			<br/>
			Senha:
			<h:inputSecret id="senha" value="#{usuarioController.usuario.senha}"/>
			<br/>
			Cargo:
			<h:selectOneMenu value="#{usuarioController.usuario.tipoAcesso}" >
				<f:selectItem itemValue="ROLE_GERENTE" itemLabel="Gerente"/>
				<f:selectItem itemValue="ROLE_VENDEDOR" itemLabel="Vendedor"/>
			</h:selectOneMenu>
			<h:commandButton value="Cadastrar" action="#{usuarioController.cadastrar}" />
			</h:form>
			
		</f:view>
	</body>	
</html>  
