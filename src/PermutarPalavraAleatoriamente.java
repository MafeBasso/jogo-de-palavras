package jogo;

import java.util.Random;

public class PermutarPalavraAleatoriamente implements Embaralhador {
	final private Random random = new Random();
	
	@Override
	public String embaralhe(String palavra) {
		char[] letras = palavra.toCharArray();
		
		for (int indexDaLetraASerTrocada = 0; indexDaLetraASerTrocada < letras.length; indexDaLetraASerTrocada++) {
            char letraQueIraSerSubstituida = letras[indexDaLetraASerTrocada];
            int indexDaNovaLetra = random.nextInt(letras.length);
            
            letras[indexDaLetraASerTrocada] = letras[indexDaNovaLetra];
            letras[indexDaNovaLetra] = letraQueIraSerSubstituida;
        }
		
		return new String(letras).toUpperCase();

	}

	@Override
	public int pontosDoEmbaralhador() {
		return 2;
	}

}
