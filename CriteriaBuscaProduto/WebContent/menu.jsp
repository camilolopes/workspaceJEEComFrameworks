<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title></title>
	</head>
	<body>
	<fieldset>
	<legend><b>Criteria - Busca</b></legend>
		<f:view>
			<h:form>
			<h:commandLink action="#{controllerProduto.todos}" value="::Todos" /><br/>
			<h:commandLink action="buscareq" value=":: Busca eq"/><br/>
			<h:commandLink action="buscalike" value=":: Busca like"/> <br/>
			<h:commandLink action="buscaany" value=":: Busca anywhere"/><br/>
			<h:commandLink action="buscageqtde" value=":: Busca ge quantidade"/><br/>		
			<h:commandLink action="projecaosoma" value=":: Projeção Soma"/><br/>	
			</h:form>
		</f:view>
		</fieldset>
	</body>	
</html>  
