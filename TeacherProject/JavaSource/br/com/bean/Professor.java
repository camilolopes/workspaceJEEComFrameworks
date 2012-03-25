package br.com.bean;


/**
 * @author Camilo
 * classe bean que representa a table Professor
 */

public class Professor {
	private int id; 
	private String nome; 
	private String formacao; 
	
	public Professor() {
		// TODO Auto-generated constructor stub
	}
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
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
}
