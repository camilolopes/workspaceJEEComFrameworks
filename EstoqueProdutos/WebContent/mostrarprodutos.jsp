<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title></title>
	</head>
	<body>
		<f:view>
			<h:form>
			<h:dataTable border="1" value="#{produtoController.exibir}" var="item" cellpadding="2" cellspacing="0">
			<f:facet name="header">
				<h:outputText value="Produtos Cadastrados"/>
			</f:facet>
			<h:column>
				<f:facet name="header">
					<h:outputText value="Código do Produto" />
				</f:facet>
				<h:outputText value="#{item.id}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputText value="Nome do produto" />
				</f:facet>
				<h:outputText value="#{item.nomeProduto}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputText value="Valor do Produto" />
				</f:facet>
				<h:outputText value="R$ "/>
				<h:outputText value="#{item.valorProduto}" />
			</h:column>
			</h:dataTable>
			<h:commandLink value="Adicionar novo Produto" action="novo" />
			</h:form>
		</f:view>
	</body>	
</html>  
