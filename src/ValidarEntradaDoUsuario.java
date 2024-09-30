package jogo;

public class ValidarEntradaDoUsuario {
	public String validarModoDeJogo(String modoDoJogo) throws ModoDeJogoInvalidoException {
		if (modoDoJogo.contains("1") || modoDoJogo.contains("2")) {
			return modoDoJogo;
		}
		
		throw new ModoDeJogoInvalidoException();
	}
}
