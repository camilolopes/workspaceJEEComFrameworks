package br.com.bean;

/**
 * @author Camilo
 *classe bean universidade que representa tabela Universidade no BD
 */
public class Universidade {
	private int id ; 
	private String nome; 
	private String curso; 
	private String profnome;
	
	public Universidade() {
		// TODO Auto-generated constructor stub
	}
	//gets e sets 
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
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String getProfnome() {
		return profnome;
	}
	public void setProfnome(String profnome) {
		this.profnome = profnome;
	}
	
	
}
