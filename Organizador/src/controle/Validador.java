package controle;
/**
 * Verifica se os dados fornecidos estao no formato esperado
 * @author Pedro Abreu
 * @version 1.0 (Abr 2021)
 *
 */
public class Validador {
	
	/**
	 * Verifica se o leitor esta preenchido. E feita somente uma verificacao
	 * @param leitor
	 * @return verdadeiro ou falso, indicando se o leitor esta ou nao vazio
	 */
	public boolean validaLeitor(String leitor) {
		boolean aux = true;
		if(leitor.isEmpty())
			aux = false;
		return aux;
	}
	/**
	 * Verifica se o email fornecido esta no formato esperado. Sao feitas tres verificacoes:
	 * (1) se o email passado e uma string vazia
	 * (2) se a string comeca com @
	 * (3) se a string contem o @
	 * @param email uma string que contem o email a ser verificado
	 * @return verdadeiro ou falso, indicando se o email e ou nao valido
	 */
	public boolean validaEmail(String email) {
		boolean aux = true;
		if(email.isEmpty())
			aux = false;
		
		if(email.startsWith("@"))
			aux = false;
		
		if(!email.contains("@"))
			aux = false;
		
		return aux;
	}
	/**
	 * Verifica se o livro esta preenchido. E feita somente uma verificacao
	 * @param livro
	 * @return verdadeiro ou falso, indicando se o livro esta ou nao vazio
	 */
	public boolean validaLivro(String livro) {
		boolean aux = true;
		if(livro.isEmpty())
			aux = false;
		return aux;
	}
	
}
