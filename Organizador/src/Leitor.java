public class Leitor extends Pessoa {

	//Variáveis de Leitor (não é necessário repetir a variável
	//nome, sendo que ela já está definida na Superclasse Pessoa).
	
	int qtMaxima = 1000;
    private Livro[] livrosCadastrados = new Livro[qtMaxima];
    private boolean[] lido = new boolean[qtMaxima];
    {
    for(int i = 0; i < qtMaxima; i++) {
    	lido[i] = true;
    }}
    int qt_livros_cad;
    String consultarLivrosCadastrados;
	String consultarTemasCadastrados;
	
	//Métodos de Leitor
	
    public Leitor(String nomeLeitor){
    	nome = nomeLeitor;
    	qt_livros_cad = 0;
    }
    
    public String toString() {
    	return "Leitor: " + nome;
    }
    
	public void cadastrar(Livro l) {
		//A menor posição que pode cadastrar um livro
    	int menor_pos_vazia = qt_livros_cad;
    	livrosCadastrados[menor_pos_vazia] = l;
    	qt_livros_cad++;
    }
    
    public void marcar(Livro l) {
    	int pos_livro = -1;
    	
    	for(int i = 0; i < qt_livros_cad; i++) {
    		//descobrir posição do livro que deseja marcar
    		if(livrosCadastrados[i].getTitulo() == l.getTitulo() && livrosCadastrados[i].getDescricao() == l.getDescricao()) {
    			pos_livro = i;
    			break;
    		}
    	}
    	
    	if(pos_livro == -1) {
    		return;
    	}
    	//Todos os livros são cadastrados como lido, caso o livro
    	//seja marcado, ele não foi lido
    	lido[pos_livro] = false;
    }
    
    public void excluir(Livro l) {
    	int pos_livro_excluir = -1;
    	
    	for(int i = 0; i < qt_livros_cad; i++) {
    		//descobrir posição do livro a excluir
    		if(livrosCadastrados[i].getTitulo() == l.getTitulo() && livrosCadastrados[i].getDescricao() == l.getDescricao()) {
    			pos_livro_excluir = i;
    			break;
    		}
    	}
    	
    	if(pos_livro_excluir == -1) {
    		return;
    	}
    	
    	for(int i = pos_livro_excluir + 1; i < qt_livros_cad; i++) {
    		//Ao excluir um livro o próximo toma a posição anterior
    		livrosCadastrados[i-1] = livrosCadastrados[i];
    	}
    	
    	qt_livros_cad--;
    } 
    
    //getters e setters
    
    public String getNome() {
    	return this.nome;    
    }
    
    public void setNome(String nomeLeitor) {
    	this.nome = nomeLeitor;
    }
    
    public Livro[] getLivro(){
    	return this.livrosCadastrados;
    }
    
    public void setLivro(Livro[] livrosCadastrados) {
    	this.livrosCadastrados = livrosCadastrados;
    }
    
    public String consultarLivrosCadastrados() {
    	String saida = "\n********Lista de Livros Cadastrados********\n";
    	for(int i =0; i < qtMaxima; i++) {
    		System.out.println(i);
    		saida = saida + "\n" + livrosCadastrados[i].getTitulo().toString();
    	}
    	return saida;
    }
    
    public String consultarTemasCadastrados() {
    	String saida = "\n********Lista de Temas Cadastrados********\n";
    	for(int i =0; i < qtMaxima; i++) {
    		System.out.println(i);
    		saida = saida + "\n" + livrosCadastrados[i].getTitulo().toString();
    	}
    	return saida;
    }
}