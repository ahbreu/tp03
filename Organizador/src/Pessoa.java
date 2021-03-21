
public abstract class Pessoa {
	
	//Variável da Superclasse Pessoa
	
	protected String nome;
	
	//Método da Superclasse Pessoa 
	
	public Pessoa() {
		this.nome = "nome";
	}
	
	public String toString() {
    	return "Nome da pessoa: " + nome;
    }
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nomePessoa) {
		nome = nomePessoa;
	}
}