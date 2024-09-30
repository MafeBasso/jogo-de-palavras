package jogo;

public class FabricaMecanicaDoJogo {
	public MecanicaDoJogo crieAMecanicaDoJogo(String modoDoJogo) {
		if (modoDoJogo.contains("1")) {
			return new MecanicaDoJogoFacil();
		} else {
			return new MecanicaDoJogoDificil();
		}
	}
}
