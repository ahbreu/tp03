package modelo;

public class Autor extends Pessoa{
	
	//Vari�veis
	
	
	private Livro[] livrosPublicados;
	
	
	//M�todos
	
	public Autor(String nome, String email, String apelido) {
		super(nome, email, apelido);
	}  
	
	public Livro[] getLivrosPublicados() {
		return livrosPublicados;
	}

	public void setLivrosPublicados(Livro[] livrosPublicados) {
		this.livrosPublicados = livrosPublicados;
	}
	
}