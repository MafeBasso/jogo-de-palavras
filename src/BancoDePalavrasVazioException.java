package jogo;

final public class BancoDePalavrasVazioException extends Exception {
	public BancoDePalavrasVazioException() {
        super("O banco de palavras está vazio.");
    }
}
