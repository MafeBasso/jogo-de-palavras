package jogo;

public interface MecanicaDoJogo {
	public int totalDePontos();
	public boolean usuarioAcertou(final String palavra, final String palpite);
	public boolean jogoTerminou();
	public boolean usuarioPodeTentarDeNovo();
	public String palavraEmbaralhada(final String palavra);
	public boolean usuarioVenceu();
}
