package jogo;

final public class ModoDeJogoInvalidoException extends Exception {
	public ModoDeJogoInvalidoException() {
        super("O modo de jogo digitado é inválido.");
    }
}
