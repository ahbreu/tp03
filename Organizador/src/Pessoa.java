
public abstract class Pessoa {
	
	//Vari�vel da Superclasse Pessoa
	
	protected String nome;
	
	//M�todo da Superclasse Pessoa 
	
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