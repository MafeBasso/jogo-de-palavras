package jogo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class BancoDePalavras {
	final private List<String> bancoDePalavras;
	final private Random random = new Random();
	
	public BancoDePalavras() throws IOException, BancoDePalavrasVazioException {
		super();
		this.bancoDePalavras = new ArrayList<String>();
		final BufferedReader reader = new BufferedReader(new FileReader("src/jogo/palavras.txt"));
		    String linha;
			while ((linha = reader.readLine()) != null) {
			    bancoDePalavras.add(linha);
			}
			reader.close();
			if (bancoDePalavras.isEmpty()) {
				throw new BancoDePalavrasVazioException();
			}
	}
	
	public String encontrePalavraAleatoria() {
		final int randomIndex = random.nextInt(bancoDePalavras.size());
		return bancoDePalavras.get(randomIndex);
	}
}
