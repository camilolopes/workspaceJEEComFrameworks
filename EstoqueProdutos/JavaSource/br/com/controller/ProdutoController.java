package br.com.controller;

import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import br.com.bean.Produto;
import br.com.dao.ProdutoDAO;

public class ProdutoController {
	
	private Produto produto;
	private DataModel model;
	
	public ProdutoController() {
		produto = new Produto();
	}
	
	public String salvar(){
			ProdutoDAO produtodao = new ProdutoDAO(); 
				produtodao.salvar(produto); 
		return "salvar"; 
	}
	//obtém todos os produtos cadastrados
	public DataModel getExibir(){
		ProdutoDAO produtodao = new ProdutoDAO(); 
		model =  new ListDataModel(produtodao.listarProduto());
		return model; 
	}
	//obtém o produto com base na busca 
	public DataModel getExibirbusca(){
		ProdutoDAO produtodao = new ProdutoDAO(); 
			produtodao.buscarProduto(produto.getNomeProduto());
		model = new ListDataModel(produtodao.buscarProduto(produto.getNomeProduto()));
		return model;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
