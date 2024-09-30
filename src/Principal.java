package jogo;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		final ValidarEntradaDoUsuario validador = new ValidarEntradaDoUsuario();
		final FabricaMecanicaDoJogo fabrica = new FabricaMecanicaDoJogo();
		
		System.out.println("Bem-vindo ao Jogo das Palavras Embaralhadas!");
		System.out.println("Escolha o modo do Jogo:");
		System.out.println("Insira 1 para o modo fácil ou 2 para o modo difícil: ");
		
		Scanner in = new Scanner(System.in);
		try {
			final BancoDePalavras banco = new BancoDePalavras();
			
			final String modoDeJogoValidado = validador.validarModoDeJogo(in.nextLine());
			final MecanicaDoJogo mecanica = fabrica.crieAMecanicaDoJogo(modoDeJogoValidado);
			
			while(!mecanica.jogoTerminou()) {
				final String palavraParaAdvinhar = banco.encontrePalavraAleatoria();
				final String palavraEmbaralhada = mecanica.palavraEmbaralhada(palavraParaAdvinhar);
				System.out.println("Advinhe a palavra a seguir:");
				System.out.println(palavraEmbaralhada);
				
				while(mecanica.usuarioPodeTentarDeNovo()) {
					final boolean acertou = mecanica.usuarioAcertou(palavraParaAdvinhar, in.nextLine());
					if (acertou) {
						System.out.println("Parabéns! Você acertou!");
						break;
					} else if (mecanica.usuarioPodeTentarDeNovo()) {
						System.out.println("Tente Novamente!");
					}
				}
			}
			
			System.out.println("Fim do Jogo");
			System.out.println(mecanica.usuarioVenceu() ? "PARABÉNS!!! VOCÊ VENCEU!!! :D" : "VOCÊ PERDEU :(");
			System.out.println("Total de pontos: " + mecanica.totalDePontos());
		} catch (BancoDePalavrasVazioException | ModoDeJogoInvalidoException e) {
		    System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
		in.close();

	}

}
