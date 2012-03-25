package br.com.camilolopes.bean;

public class UsuarioEmail {
	private int iduser;
	private String nome; 
	private String sobrenome; 
	private String email; 
	public UsuarioEmail() {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIduser() {
		return iduser;
	}
	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	
}
