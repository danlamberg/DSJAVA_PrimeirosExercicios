package Ex4;

public class Jogador {
    
    private String nomeJogador;
    private int pontuacao;
    private String nivel;

    public Jogador(String nome, int pontos, String level) {
        nomeJogador = nome;
        pontuacao = pontos;
        nivel = level;
    }

    public void aumentarPontuacao(int pontos) {
        pontuacao = pontuacao + pontos;

        if (pontuacao >= 1500) {
            nivel = "Difícil";
        } else if (pontuacao >= 1250) {
            nivel = "Difícil";
        } else if (pontuacao >= 1000) {
            nivel = "Desafiante";
        } else if (pontuacao >= 500) {
            nivel = "Moderado";
        } else if (pontuacao >= 250) {
            nivel = "Fácil";
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome do jogador: " + nomeJogador);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nível: " + nivel);
    }
}