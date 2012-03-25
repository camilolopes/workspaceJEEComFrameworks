<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title></title>
	</head>
	<body>
		<f:view>
			<h:form>
			<h:dataTable value="#{sUsuarioController.todosUser}" var="user" border="1">
			<h:column>
				<f:facet name="header">
				<h:outputText value="login"/>
				</f:facet>
				<h:outputText value="#{user.login}"/>
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputText value="senha"/>
				</f:facet>
				<h:outputText value="*****" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputText value="tipoacesso"/>
				</f:facet>
				<h:outputText rendered="#{user.tipoacesso=='ROLE_GERENTE'}" value="Gerente"/>
				<h:outputText rendered="#{user.tipoacesso=='ROLE_VENDEDOR'}" value="Vendedor"/>
			</h:column>
			</h:dataTable>
			</h:form>
		</f:view>
	</body>	
</html>  
