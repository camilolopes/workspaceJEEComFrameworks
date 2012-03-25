<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title></title>
	</head>
	<body>
	<fieldset><legend>Criteria Busca</legend>
		<f:view>
			<h:form id="busca">
			<h:inputText id="nome" size="30" value="#{controllerProduto.produto.nome}"/><br/>
			<h:commandButton action="#{controllerProduto.buscaany}" value="Buscar" />
			<h:messages/>
			</h:form>
		</f:view>
		</fieldset>
	</body>	
</html>  
