import java.util.*;
import java.text.SimpleDateFormat;

public class Teste {
	
	static Leitor Le1;
	static Autor A1;
	static Livro Lv1;
	static Tema T1;
	static Leitor Le2;
	static Autor A2;
	static Livro Lv2;
	static Tema T2;
	
	public static void main(String[] args) {
		
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		String dataCadastro = data.format(new Date());
		
		Le1 = new Leitor("Pedro Abreu");
		Le2 = new Leitor("Thais Mamede");
		
		A1 = new Autor("Rick Riordan");
		A2 = new Autor("Dan Brown");
		
		Lv1 = new Livro("Percy Jackson e o Ladrão de Raios", 2010, "Percy Jackson, o menino que aos doze anos descobre que é um semideus, filho de Poseidon.", dataCadastro);
		Lv2 = new Livro("A Origem", 2017, "NÃO IMPORTA QUEM VOCÊ SEJA NEM NO QUE ACREDITE. TUDO ESTÁ PRESTES A MUDAR.", dataCadastro);
		
		T1 = new Tema("Aventura");
		T2 = new Tema("Ficção");
		
		System.out.println(Le1);
		System.out.println(A1);
		System.out.println(Lv1);
		System.out.println(T1);
		System.out.println("\n\n");
		System.out.println(Le2);
		System.out.println(A2);
		System.out.println(Lv2);
		System.out.println(T2);
		System.out.println("\n\n");
		
		System.out.println(Le1.consultarLivrosCadastrados);
		System.out.println(Le1.consultarTemasCadastrados);
		System.out.println("Filtro");
		System.out.println("Pesquisa");
		
		}
}