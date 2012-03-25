<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title></title>
	</head>
	<body>
		<f:view>
			<h:form>
			<h:outputText value="Institui��o" /> <br/>
			<h:inputText id="nomeinstituicao" size="50" value="#{controlerUni.universidade.nome}"/> 
			<p>
			Informe o curso:<br/><h:selectOneMenu id="listacurso"  value="#{controlerUni.universidade.curso}" >
				<f:selectItem itemLabel="Ci�ncia da Computa��o" itemValue="Ci�ncia da Computa��o" />
				<f:selectItem itemLabel="Sistemas de Informa��o" itemValue="Sistemas de Informa��o"/>
				<f:selectItem itemLabel="Especializa��o em Redes" itemValue="Especializacao em redes"/>
			</h:selectOneMenu>
			</p>
				<p>
			<h:outputLabel value="Professor"/><br/>
			<h:selectOneMenu id="categoria" value="#{controlerUni.universidade.profnome}" >
			<f:selectItem itemLabel="Selecione um Professor"/>
			<f:selectItems value="#{professorcontrol.categorias}"/>			
			</h:selectOneMenu>	
			</p>		
			<p><h:commandButton value="Cadastrar" action="#{controlerUni.salvar}"/> </p>
			</h:form>
		</f:view>
	</body>	
</html>  
