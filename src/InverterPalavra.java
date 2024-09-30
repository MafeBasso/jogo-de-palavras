package jogo;

public class InverterPalavra implements Embaralhador {

	@Override
	public String embaralhe(String palavra) {
		return new StringBuilder(palavra).reverse().toString().toUpperCase();
	}

	@Override
	public int pontosDoEmbaralhador() {
		return 1;
	}

}
