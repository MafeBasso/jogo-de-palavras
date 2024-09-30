package jogo;

public class MecanicaDoJogoFacil implements MecanicaDoJogo {
	final private FabricaEmbaralhadores fabrica = new FabricaEmbaralhadores();
	final private Embaralhador embaralhador;
	static final private int pontuacaoMaxima = 100;
	private int pontos = 0;
	private int tentativas = 0;
	
	public MecanicaDoJogoFacil() {
		super();
		this.pontos = 0;
		this.embaralhador = fabrica.crieEmbaralhadorAleatoriamente();
	}

	@Override
	public int totalDePontos() {
		return pontos > pontuacaoMaxima ? pontuacaoMaxima : pontos;
	}

	@Override
	public boolean usuarioAcertou(String palavra, String palpite) {
		final boolean acertou = palavra.equalsIgnoreCase(palpite);
		tentativas++;
		if (acertou) {
			pontos = pontos + embaralhador.pontosDoEmbaralhador() * (int) Math.ceil(palavra.length()/2);
		}
		return acertou;
	}

	@Override
	public boolean jogoTerminou() {
		return !usuarioPodeTentarDeNovo() || pontos >= pontuacaoMaxima;
	}

	@Override
	public boolean usuarioPodeTentarDeNovo() {
		return tentativas < 5;
	}

	@Override
	public String palavraEmbaralhada(String palavra) {
		tentativas = 0;
		return embaralhador.embaralhe(palavra);
	}

	@Override
	public boolean usuarioVenceu() {
		return pontos >= pontuacaoMaxima;
	}
}
