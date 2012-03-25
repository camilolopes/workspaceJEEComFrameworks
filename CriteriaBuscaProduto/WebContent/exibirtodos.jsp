<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title></title>
	</head>
	<body>
		<f:view>
			<h:form>
				<h:dataTable value="#{controllerProduto.produtos}" var="prod"
				 border="1" cellpadding="2" cellspacing="0" >
					<f:facet name="header">
					<h:outputText value="Exibir Produtos - Criteria"/>
					</f:facet>
					<h:column>
						<f:facet name="header">
							<h:outputText value="Nome do Produto"/>							
						</f:facet>
						<h:outputText value="#{prod.nome}" />
										
					</h:column>
					<h:column>
						<f:facet name="header">
							<h:outputText value="Quantidade"/>
						</f:facet>
						<h:outputText value="#{prod.quantidade}" />
					</h:column>
						
				</h:dataTable>
								
				<h:commandLink value=":: Ordenar Crescente por nome" action="#{controllerProduto.ordernomeasc}" /><br/>
				<h:commandLink value="::Ordenar Descendente por Qtde" action="#{controllerProduto.orderqtdedesc}" /> 
								
			</h:form>
		</f:view>
	</body>	
</html>  
