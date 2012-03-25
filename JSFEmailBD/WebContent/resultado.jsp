<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title></title>
	</head>
	<body>
		<f:view>
			<h:form>
			<h:dataTable border="1" value="#{usuarioController.todos}" var="us">
			<h:column>
			<f:facet name="header">
				<h:outputText value="Nome"/>
			</f:facet>
			<h:outputText value="#{us.nome}"/>
			</h:column>
			<h:column>
			<f:facet name="header">
				<h:outputText value="Sobrenome"/>
			</f:facet>
			<h:outputText value="#{us.sobrenome}"/>
			</h:column>
			<h:column>
			<f:facet name="header">
				<h:outputText value="E-mail"/>
			</f:facet>
			<h:outputText value="#{us.email}"/>
			</h:column>		
			</h:dataTable>
			</h:form>
		</f:view>
	</body>	
</html>  
