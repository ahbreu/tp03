package controle;

import modelo.*;

public class ControleLeitor extends Leitor {
	private Leitor[] lt;
	private int qtdLeitores;
	
	public ControleLeitor(ControleDados d, String nome, String email, String apelido) {
		super(nome, email, apelido);
		lt = d.getLeitores();
		qtdLeitores = d.getQtdLeitores();
		
	}
	
	public String[] getNomeLeitor() {
			String[] s = new String[qtdLeitores];
			for(int i = 0; i < qtdLeitores; i++) {
					s[i] = lt[i].getNome();
			}
			return s;
	}
	public int getQtd() {
		return qtdLeitores;
	}

	public void setQtd(int qtd) {
		this.qtdLeitores = qtd;
	}
	
	public String getNome(int i) {		
		return lt[i].getNome();
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