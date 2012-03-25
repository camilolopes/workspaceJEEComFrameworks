<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title></title>
	</head>
	<body>
		<f:view>
			<h:form>
				<h:dataTable cellpadding="2" cellspacing="0" border="1" var="item" value="#{produtoController.exibirbusca}">
				<f:facet name="header">
					<h:outputText value="Resultado da Busca" />
				</f:facet>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Código Produto"/>
					</f:facet>
					<h:outputText value="#{item.id}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Nome do Produto" />
					</f:facet>
					<h:outputText value="#{item.nomeProduto}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Estoque Disponivel"/>
					</f:facet>				
					<h:outputText value="#{item.qtde}"/>
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Preço"></h:outputText>
					</f:facet>
					<h:outputText value="#{item.valorProduto}" />
				</h:column>
				</h:dataTable>
			</h:form>
		</f:view>
	</body>	
</html>  
