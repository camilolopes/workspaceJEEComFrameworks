<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title></title>
	</head>
	<body>
		<f:view><fieldset><b><legend>Cadastrar Função </legend></b>
			<h:form>
				<h:outputText value="Nova Função:" />
				<br/><h:inputText id="funcao" size="30" value="#{controllerFuncao.loginfuncao.funcao}" />
				<br/><h:commandButton type="submit" value="Cadastrar" action="#{controllerFuncao.salvarfuncao}" />
				&nbsp; <h:commandButton type="submit" value="Cancelar" action="cancelar" />
				</h:form>
				</fieldset>		
		</f:view>
	</body>	
</html>  
