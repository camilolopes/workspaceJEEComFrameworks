<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title></title>
	</head>
	<body><fieldset><legend>Cadastro de Produtos</legend>
		<f:view>
		<h:form>
			<h:outputText value="Nome: "/> <br/>
			<h:inputText id="nome" size="60" 
			value="#{produtoController.produto.nomeProduto}" required="true" requiredMessage="Campo Obrigatório"/>
			<h:message for="nome"/>			
			<br/>
			<h:outputText value="Preço Unitário:"/><br/>
			<h:inputText id="valorproduto"
			 value="#{produtoController.produto.valorProduto}" required="true" requiredMessage="Campo Obrigatório" />
			 <h:message for="valorproduto"/>			
			<br/>
			<h:outputText value="Quantidade:"/><br/>
			<h:inputText id="qtde" value="#{produtoController.produto.qtde}"  />
			<br/><h:commandButton type="submit" value="Cadastrar" action="#{produtoController.salvar}" />
			<br/><h:commandLink value=":: Exibir Produtos" action="exibir" immediate="true" />
			<br/><h:commandLink value=":: Buscar Produtos" action="buscar" immediate="true"/>				
			</h:form>			
		</f:view>
		</fieldset>
	</body>	
</html>  
