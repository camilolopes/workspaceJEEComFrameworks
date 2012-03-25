package br.com.bean;

public class Produto {
	private int id; 
	private String nomeProduto =""; 
	private Double valorProduto; 
	private int qtde; 
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public Double getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(Double valorProduto) {
		this.valorProduto = valorProduto;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
}
