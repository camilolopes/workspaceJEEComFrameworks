<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title></title>
	</head>
	<body>
		<f:view>
		<h:form>
			<h:outputText value="Menu Principal" /> <br/> <p/>
			<h:commandLink value=":: Cadastro de professor" action="Cadastrar Professor"/> <br/> <p/>
			<h:commandLink value=":: Exibir professores" action="exibir"/> <p/>
			<h:commandLink value=":: Cadastro Instituição" action="cadastrar" 
			/>
			</h:form>
		</f:view>
	</body>	
</html>  
