<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title></title>
	</head>
	<body>
	<fieldset><legend>Menu Principal</legend>
		<f:view>
			<h:form>
				<h:commandLink value=":: Cadastrar Usu�rio" action="#{controllerLogin.novologin}" />
				<br/>
				<h:commandLink value=":: Exibir Usu�rio" action="exibirlogin" />
				<br/>
				<h:commandLink value=":: Cadastrar Fun��o" action="cadastrarfuncao" />
			</h:form>
		</f:view>
		</fieldset>
	</body>	
</html>  
