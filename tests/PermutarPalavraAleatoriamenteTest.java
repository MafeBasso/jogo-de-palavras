package jogo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PermutarPalavraAleatoriamenteTest {

	@Test
	void testarPermutacao() {
		final String palavra = "abcd";
		final PermutarPalavraAleatoriamente permutar = new PermutarPalavraAleatoriamente();
		final String resultado = permutar.embaralhe(palavra);
		
		assertEquals(resultado.toUpperCase(), resultado);
		assertEquals(palavra.length(), resultado.length());
		assertNotEquals(palavra.toUpperCase(), resultado);
	}

	@Test
	void testarPontos() {
		final PermutarPalavraAleatoriamente permutar = new PermutarPalavraAleatoriamente();
		
		assertEquals(2, permutar.pontosDoEmbaralhador());
	}
}
