<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title></title>
	</head>
	<body>
		<f:view>
			<h:form>
			<b>Digite o seu nome:</b>
			<br/>
			<h:inputText size="40" value="#{controller.usuario.nome}"/>
			<h:commandButton value="Acessar" action="#{controller.exibir}"/>
			</h:form>
		</f:view>
	</body>	
</html>  
