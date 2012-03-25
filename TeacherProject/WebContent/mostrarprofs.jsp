<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title></title>
	</head>
	<body>
		<f:view>
		<h:form>
			<h:dataTable value="#{professorcontrol.todos}" var="prof" border="1">
			<f:facet name="header">
			<h:outputText value="Professores"/>
			</f:facet>
			
			<h:column>
			<f:facet name="header">
			<h:outputText value="ID"/>
			</f:facet>
			<h:outputText value="#{prof.id}"/>
			</h:column>
			
			<h:column>
			<f:facet name="header">
			<h:outputText value="Nome"/>
			</f:facet>
			<h:outputText value="#{prof.nome}" />
			</h:column>
			
			
			<h:column>
			<f:facet name="header">
			<h:outputText value="Bacharelado"/>
			</f:facet>
			<h:outputText value="#{prof.formacao}" />
			</h:column>
			
			</h:dataTable>
			<h:commandLink value="Novo Cadastro" action="novo"/> &nbsp;&nbsp;
			<h:commandLink value="Página Inicial" action="inicio"/>
			<br/>
			<br/>		
			</h:form>		
			
		</f:view>
	</body>	
</html>  
