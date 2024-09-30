package jogo;

import java.util.Random;

public class FabricaEmbaralhadores {
	private final Random random;
	
	public FabricaEmbaralhadores() {
        this.random = new Random();
    }
	
	public Embaralhador crieEmbaralhadorAleatoriamente() {
        return random.nextBoolean() ? new PermutarPalavraAleatoriamente() : new InverterPalavra();
	}
}
