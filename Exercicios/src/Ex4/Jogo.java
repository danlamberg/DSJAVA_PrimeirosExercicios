package Ex4;
import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do jogador:");
        String nome = scanner.nextLine();

        System.out.println("Informe a pontuação inicial do jogador:");
        int pontuacao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.println("Informe o nível do jogador (Níveis disponíveis: Fácil, Moderado, Desafiante, Difícil):");
        String nivel = scanner.nextLine();

        // Modificação para aceitar "Difícil" com ou sem acento
        if (nivel.equalsIgnoreCase("dificil") || nivel.equalsIgnoreCase("difícil")) {
            nivel = "Difícil";
        } else if (nivel.equalsIgnoreCase("desafiante")) {
            nivel = "Desafiante";
        } else if (nivel.equalsIgnoreCase("moderado")) {
            nivel = "Moderado";
        } else if (nivel.equalsIgnoreCase("fácil")) {
            nivel = "Fácil";
        } else {
            System.out.println("Nível inválido. Definindo como Fácil por padrão.");
            nivel = "Fácil";
        }

        Jogador jogador = new Jogador(nome, pontuacao, nivel);

        System.out.println("Informações do jogador antes das atualizações: ");
        jogador.exibirInformacoes();
        System.out.println();

        // Atualizando pontuação
        jogador.aumentarPontuacao(50);

        System.out.println("Informações do jogador após a atualização da pontuação: ");
        jogador.exibirInformacoes();

        // Fechando o scanner
        scanner.close();
    }
}
