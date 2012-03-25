<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title></title>
	</head>
	<body>
	
		<f:view>
			<h:form>
				<b><h:outputText value="Cadastro de Produto" /></b> <br/>
				<h:outputText value="Nome do produto:" /><br/>
				<h:inputText id="nome" value="#{controllerProd.produto.nome}"  size="40"/><br/>
				<h:outputText value="Qtde:"/><br/>
				<h:inputText id="qtde" value="#{controllerProd.produto.quantidade}" size="10"/>		
				<h:commandButton type="submit" value="Cadastrar" action="#{controllerProd.salvar}" /> &nbsp;
				<h:commandButton id="cancela" type="submit" value="Cancelar" 
				immediate="true" action="cancelado"/>
			</h:form>
		</f:view>
	</body>	
</html>  
