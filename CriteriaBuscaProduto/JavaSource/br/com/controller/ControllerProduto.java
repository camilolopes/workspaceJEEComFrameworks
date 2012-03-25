package br.com.controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import br.com.bean.Produto;
import br.com.dao.ProdutoDAO;

public class ControllerProduto {
	private Produto produto;
	private DataModel model;
	private List resultado; 
	private String projecaoone; 
	private Number resultadoprojecao;
	
	public ControllerProduto() {
		produto = new Produto();
	}
	
	public String buscaEq(){
		ProdutoDAO proddao = new ProdutoDAO(); 
			resultado  = proddao.buscarEq(produto.getNome());			
			if(resultado.isEmpty()){
				FacesContext context = FacesContext.getCurrentInstance(); 
				String msg = "Produto não encontrado"; 
				FacesMessage message = new FacesMessage(msg);
					context.addMessage("busca", message);
				return "buscaeqfalse";
			}else{ 
		return "buscaeq";
			}
	}
	public String buscaLike(){
		ProdutoDAO proddao = new ProdutoDAO(); 
			resultado = proddao.buscarlike(produto.getNome()); 
		if(resultado.isEmpty()){ 
			FacesContext context = FacesContext.getCurrentInstance(); 
			String msg = "Nenhum Produto foi encontrado"; 
			FacesMessage message = new FacesMessage(msg); 
				context.addMessage("busca", message);
			return "buscalikefalse";			
		}else{
				
		return "buscalike";} 
	}
	public String buscaany(){
		ProdutoDAO produtodao = new ProdutoDAO(); 
			resultado = produtodao.buscarany(produto.getNome());
			if(resultado.isEmpty()){
				FacesContext context = FacesContext.getCurrentInstance(); 
				String msg = "Nenhum produto foi encontrado";
				FacesMessage message = new FacesMessage(msg);
				context.addMessage("busca", message);
				return "buscaanyfalse";
			}else{		
		return "buscaany";}
	}
	//lista todos os produtos
	public String todos(){
		ProdutoDAO produtodao = new ProdutoDAO(); 
			resultado = produtodao.buscarTodos();			
		return "listartodos";
	}
	
	public String buscageqtde(){
			ProdutoDAO proddao = new ProdutoDAO(); 
		resultado = proddao.buscarge(produto.getQuantidade());
		return "buscageqtde"; 
	}
	public String ordernomeasc(){
		ProdutoDAO proddao = new ProdutoDAO(); 
		resultado = proddao.ordernomeasc();
		return "ordernomeasc"; 
	}
	public String orderqtdedesc(){
		ProdutoDAO proddao = new ProdutoDAO();
		//retorna a lista de produtos na ordem descedente
		resultado = proddao.orderqtdedesc();  
		return "orderqtdedesc"; 
	}
	public String projecaosoma(){
		ProdutoDAO proddao = new ProdutoDAO(); 
			resultadoprojecao =  proddao.projecaosoma(projecaoone);
		return "projecaosoma"; 
	}
	public DataModel getProdutos(){
		model = new ListDataModel(resultado);
		return model; 
	}
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String getProjecaoone() {
		return projecaoone;
	}

	public void setProjecaoone(String projecaoone) {
		this.projecaoone = projecaoone;
	}

	public Number getResultadoprojecao() {
		return resultadoprojecao;
	}

	public void setResultadoprojecao(Number resultadoprojecao) {
		this.resultadoprojecao = resultadoprojecao;
	}

}
