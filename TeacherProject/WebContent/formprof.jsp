<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title></title>
	</head>
	<body>
		<f:view>
			<h:form>
			<h:outputText value="Cadastro Professores"/><br/> <br/>
			<h:outputText value="Nome: "/> 
			<h:inputText id="nome" size="60" value="#{professorcontrol.professor.nome}"/>
			<br/><h:outputText value="Forma��o Principal:"/> 
			<h:selectOneMenu id="formacao" value="#{professorcontrol.professor.formacao}">
			<f:selectItem id="opt1" itemLabel="Analista de Sistemas" itemValue="Analista de Sistemas" />
			<f:selectItem id="opt2" itemLabel="Ci�ncia da Computa��o" itemValue="Ci�ncia da Computa��o"/>
			<f:selectItem id="opt3" itemLabel="Processamento de Dados" itemValue="Processamento de Dados" />
			<f:selectItem id="opt4" itemLabel="Outros" itemValue="Outros"/>
			</h:selectOneMenu> <br/> <br/>
			
			<h:commandButton value="Cadastrar Professor" action="#{professorcontrol.salvar}"/> 
			<h:commandButton value="cancelar" action="cancelar" />
			</h:form>
		</f:view>
	</body>	
</html>  
