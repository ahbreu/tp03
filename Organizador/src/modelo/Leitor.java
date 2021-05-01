package modelo;

public class Leitor extends Pessoa {

	
	protected int qtMaxima = 1000;
    public boolean[] lido = new boolean[qtMaxima];
    {
    for(int i = 0; i < qtMaxima; i++) {
    	lido[i] = true;
    }}
    public int qt_livros_cad;
	
	
    public Leitor(String nome, String email, String apelido){
    	super(nome, email, apelido);
    	qt_livros_cad = 0;
    }
    //getters e setters
    
    public String getNome() {
    	return this.nome;    
    }
    
    public void setNome(String nomeLeitor) {
    	this.nome = nomeLeitor;
    }
}