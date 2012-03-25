package br.com.controller;

import br.com.bean.Produto;
import br.com.dao.ProdutoDAO;

public class ControllerProd {
	private Produto produto; 
	public ControllerProd() {
		produto = new Produto(); 
	}
	public String salvar(){
		ProdutoDAO produtodao = new ProdutoDAO(); 
			produtodao.salvar(produto);
		return "salvar";
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
