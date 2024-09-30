package jogo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InverterPalavraTest {
	@Test
	void testarInversao() {
		final String palavra = "lua";
		final InverterPalavra inverter = new InverterPalavra();
		
		assertEquals("AUL", inverter.embaralhe(palavra));
	}

	@Test
	void testarPontos() {
		final InverterPalavra inverter = new InverterPalavra();
		
		assertEquals(1, inverter.pontosDoEmbaralhador());
	}
}
