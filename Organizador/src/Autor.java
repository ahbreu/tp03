public class Autor extends Pessoa{
	
	//Variáveis
	
	
	private Livro[] livrosPublicados;
	
	//Métodos
	
	public Autor(String nomeAutor) {
		nome = nomeAutor;
	}
	
	public String toString() {
    	return "Nome do autor:\n" + nome;
    }
	
	public String getNome() {
	    	return this.nome;    
	    }
	    
	public void setNome(String nomeLeitor) {
	    	this.nome = nomeLeitor;
	    }
	    
	
	public Livro[] getLivrosPublicados() {
		return livrosPublicados;
	}

	public void setLivrosPublicados(Livro[] livrosPublicados) {
		this.livrosPublicados = livrosPublicados;
	}
	
}