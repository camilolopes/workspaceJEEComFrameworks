<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title></title>
	</head>
	<body>
		<f:view>
		<fieldset>
		<legend>Projeção Resultado</legend>
			<h:form>
				<h:panelGrid border="0" cellpadding="2" cellspacing="0" >				
				<h:column>
				<tr>
				<td><h:outputText rendered="#{controllerProduto.projecaoone=='maiorprod'}" value="Produto com maior Estoque: " /></td>
				<td><h:outputText rendered="#{controllerProduto.projecaoone=='soma'}" value="Total de Produtos em Estoque: " /> </td>
				<td><h:outputText value="#{controllerProduto.resultadoprojecao}">
					<f:convertNumber />
					</h:outputText></td>
				</tr>
					
				</h:column>
			</h:panelGrid>					
			</h:form>
			</fieldset>
		</f:view>
	</body>	
</html>  
