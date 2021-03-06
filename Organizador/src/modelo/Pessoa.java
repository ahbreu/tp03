package modelo;
/**
 * Classe abstrata que origina a classe Leitor
 * @author Pedro Abreu
 * @version 1.0 (Abr 2021)
 *
 */
public abstract class Pessoa {
	
	
	
	protected String nome;
	protected String email;
	protected String apelido;
	
	 
	
	public Pessoa(String nome, String email, String apelido) {
		this.nome = nome;
		this.email = email;
		this.apelido = apelido;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getApelido() {
		return this.apelido;
	}
	
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
}