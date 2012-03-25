<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title></title>
	</head>
	<body>
		<f:view>
			<h:form>
			<b>Dados cadastrados com sucesso:</b> <br/>
			<h:outputText value="#{usuarioController.usuarioemail.nome}"/><br/>
			<h:outputText value="#{usuarioController.usuarioemail.sobrenome}"/><br/>
			<h:outputText value="#{usuarioController.usuarioemail.email}"/>
			</h:form>
		</f:view>
	</body>	
</html>  
