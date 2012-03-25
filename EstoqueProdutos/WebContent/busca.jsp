<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title></title>
	</head>
	<body>
	<FIELDSET>
		<legend>Buscar um produto</legend>
	
		<f:view>
			<h:form>
				<h:outputText value="Informe o nome do produto: "/>
				<h:inputText id="nome" value="#{produtoController.produto.nomeProduto}" size="50"/>
				
				<h:commandButton value="Buscar" action="buscar" />
			</h:form>
		</f:view>
		</FIELDSET>
	</body>	
</html>  
