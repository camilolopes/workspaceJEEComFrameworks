<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title></title>
	</head>
	<body>
		<f:view>
			<h:form>
			<h:dataTable cellpadding="2" cellspacing="0" 
			value="#{controllerLogin.exibirLogin}" border="1" var="item">
				<f:facet name="header">
					<h:outputText value="Exibindo Usuários" />
				</f:facet>
				<h:column>
				<f:facet name="header">
					<h:outputText value="Nome" />
				</f:facet>
				<h:outputText value="#{item.nome}"/>
				</h:column>
				<h:column>
				<f:facet name="header">
				<h:outputText value="Login" />
				</f:facet>
				<h:outputText value="#{item.login}" />
				</h:column>
				
				<h:column>
				<f:facet name="header">
				<h:outputText value="Função" />
				</f:facet>
				<h:outputText value="#{item.funcao}" />
				</h:column>
			</h:dataTable>			
			</h:form>
		</f:view>
	</body>	
</html>  
