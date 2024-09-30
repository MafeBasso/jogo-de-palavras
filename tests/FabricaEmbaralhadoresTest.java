package jogo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FabricaEmbaralhadoresTest {
	@Test
	void testFabrica() {
		final FabricaEmbaralhadores fabrica = new FabricaEmbaralhadores();
		final Embaralhador resultado = fabrica.crieEmbaralhadorAleatoriamente();
		final Class<? extends Embaralhador> classeDoResultado = resultado.getClass();
		
		assertTrue(classeDoResultado.equals(InverterPalavra.class) || classeDoResultado.equals(PermutarPalavraAleatoriamente.class));
	}
}
