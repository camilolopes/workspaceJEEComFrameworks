<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title></title>
	</head>
	<body>
		<f:view>
			olá <h:outputText value="#{controller.usuario.nome}"/>
			 Bem-Vindo ao JSF World!
		</f:view>
	</body>	
</html>  
