<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title></title>
	</head>
	<body>
		<f:view>
			<h:form>
			<h:outputText value="Instituição" /> <br/>
			<h:inputText id="nomeinstituicao" size="50" value="#{controlerUni.universidade.nome}"/> 
			<p>
			Informe o curso:<br/><h:selectOneMenu id="listacurso"  value="#{controlerUni.universidade.curso}" >
				<f:selectItem itemLabel="Ciência da Computação" itemValue="Ciência da Computação" />
				<f:selectItem itemLabel="Sistemas de Informação" itemValue="Sistemas de Informação"/>
				<f:selectItem itemLabel="Especialização em Redes" itemValue="Especializacao em redes"/>
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
