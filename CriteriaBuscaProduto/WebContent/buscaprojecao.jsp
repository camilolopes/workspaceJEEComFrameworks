<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title></title>
	</head>
	<body>
		<f:view>
			<h:form>
			<h:outputText value="selecione sua projeção" />
			<br/>
			<h:selectOneMenu id="projecao" value="#{controllerProduto.projecaoone}">
			<f:selectItem id="soma" itemLabel="Total Produtos" itemValue="soma"/>
			<f:selectItem id="maiorpod" itemLabel="Produto maior Estoque" itemValue="maiorprod"/>
			</h:selectOneMenu>
			<h:commandButton value="projetar" type="submit" action="#{controllerProduto.projecaosoma}"/>
			</h:form>
		</f:view>
	</body>	
</html>  
