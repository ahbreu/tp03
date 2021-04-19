package pacoteDeTeste;
/**
 * Classe que executa os testes da classe validador
 * @author Pedro Abreu
 * @version 1.0 (Abr 2021)
 *
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controle.Validador;

class TesteValidador {
	Validador v = new Validador();

	@Test
	void testValidaLeitor() {
		assertTrue(v.validaLeitor("nome leitor"));
		assertFalse(v.validaLeitor(""));
	}

	@Test
	void testValidaEmail() {
		assertTrue(v.validaEmail("leitor@gmail.com"));
		assertFalse(v.validaEmail(""));
		assertFalse(v.validaEmail("leitor.gmail.com"));
		assertFalse(v.validaEmail("@leitor@gmail.com"));
	}

	@Test
	void testValidaLivro() {
		assertTrue(v.validaLivro("nome livro"));
		assertFalse(v.validaLivro(""));
	}

}
