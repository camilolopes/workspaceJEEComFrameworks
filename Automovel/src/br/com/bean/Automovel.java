package br.com.bean;

public class Automovel {
	int id; 
	String nome; 
	int ano; 
	String fabricantenome;
	//gets/sets
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getFabricantenome() {
		return fabricantenome;
	}
	public void setFabricantenome(String fabricantenome) {
		this.fabricantenome = fabricantenome;
	} 
	
}
