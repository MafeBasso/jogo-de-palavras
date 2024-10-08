```
classDiagram
    class Principal {
        - validador: ValidarEntradaDoUsuario
        - fabrica: FabricaMecanicaDoJogo
        + main(String[] args)
    }
    class ValidarEntradaDoUsuario {
        + validarModoDeJogo(String modoDoJogo): String
        -- throws ModoDeJogoInvalidoException
    }
    class BancoDePalavras {
        - bancoDePalavras: List<String>
        - random: Random
        + BancoDePalavras()
        + encontrePalavraAleatoria(): String
    }
    class BancoDePalavrasVazioException extends Exception
    class interface Embaralhador {
        + embaralhe(String palavra): String
        + pontosDoEmbaralhador(): int
    }
    class FabricaEmbaralhadores {
        - random: Random
        + FabricaEmbaralhadores()
        + crieEmbaralhadorAleatoriamente(): Embaralhador
    }
    class InverterPalavra implements Embaralhador {
        + embaralhe(String palavra): String
        + pontosDoEmbaralhador(): int
    }
    class PermutarPalavraAleatoriamente implements Embaralhador {
        - random: Random
        + embaralhe(String palavra): String
        + pontosDoEmbaralhador(): int
    }
    class interface MecanicaDoJogo {
        + totalDePontos(): int
        + usuarioAcertou(String palavra, String palpite): boolean
        + jogoTerminou(): boolean
        + usuarioPodeTentarDeNovo(): boolean
        + palavraEmbaralhada(String palavra): String
        + usuarioVenceu(): boolean
    }
    class FabricaMecanicaDoJogo {
        + crieAMecanicaDoJogo(String modoDoJogo): MecanicaDoJogo
    }
    class MecanicaDoJogoFacil extends MecanicaDoJogo {
        - embaralhador: Embaralhador
        - pontos: int
        - tentativas: int
        + MecanicaDoJogoFacil()
    }
    class MecanicaDoJogoDificil extends MecanicaDoJogo {
        - embaralhador: Embaralhador
        - pontos: int
        - tentativas: int
        + MecanicaDoJogoDificil()
    }
    class ModoDeJogoInvalidoException extends Exception

    Principal --> ValidarEntradaDoUsuario
    Principal --> FabricaMecanicaDoJogo
    FabricaMecanicaDoJogo --> BancoDePalavras
    BancoDePalavras --> BancoDePalavrasVazioException
    BancoDePalavras --o Random
    BancoDePalavrasVazioException --> Exception
    FabricaEmbaralhadores --o Random
    FabricaEmbaralhadores --> PermutarPalavraAleatoriamente
    FabricaEmbaralhadores --> InverterPalavra
    InverterPalavra --> Embaralhador
    PermutarPalavraAleatoriamente --> Embaralhador
    MecanicaDoJogoFacil --o FabricaEmbaralhadores
    MecanicaDoJogoFacil --o Embaralhador
    MecanicaDoJogoDificil --o FabricaEmbaralhadores
    MecanicaDoJogoDificil --o Embaralhador
    FabricaMecanicaDoJogo --> MecanicaDoJogoFacil
    FabricaMecanicaDoJogo --> MecanicaDoJogoDificil
    ModoDeJogoInvalidoException --> Exception
```
