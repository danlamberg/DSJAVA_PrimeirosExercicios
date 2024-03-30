import java.util.Scanner;

public class Exercícios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("Escolha o exercício que deseja executar:");
                System.out.println("1 - Exercício 1 (Calculadora)");
                System.out.println("2 - Exercício 2 (Minha Biblioteca)");
                System.out.println("3 - Exercício 3 (Conta Bancária)");
                System.out.println("4 - Exercício 4 (Jogador)");
                System.out.println("5 - Exercício 5 (Condutor)");
                System.out.println("6 - Exercício 6 (Agenda)");
                System.out.println("7 - Exercício 7 (Consumidor)");
                System.out.println("8 - Exercício 8 (Pizzaria)");
                System.out.println("0 - Sair");

                int escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.println("Exercício selecionado: Exercício 1 (Calculadora)");
                        Ex1.Calculadora.main(args);
                        break;
                    case 2:
                        System.out.println("Exercício selecionado: Exercício 2 (Minha Biblioteca)");
                        Ex2.MinhaBiblioteca.main(args);
                        break;
                    case 3:
                        System.out.println("Exercício selecionado: Exercício 3 (Conta Bancária)");
                        Ex3.Banco.main(args);
                        break;
                    case 4:
                        System.out.println("Exercício selecionado: Exercício 4 (Jogador)");
                        Ex4.Jogo.main(args);
                        break;
                    case 5:
                        System.out.println("Exercício selecionado: Exercício 5 (Condutor)");
                        Ex5.Condutor.main(args);
                        break;
                    case 6:
                        System.out.println("Exercício selecionado: Exercício 6 (Agenda)");
                        Ex6.Agenda.main(args);
                        break;
                    case 7:
                        System.out.println("Exercício selecionado: Exercício 7 (Consumidor)");
                        Ex7.Consumidor.main(args);
                        break;
                    case 8:
                        System.out.println("Exercício selecionado: Exercício 8 (Pizzaria)");
                        Ex8.Pizzaria.main(args);
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        System.exit(0);
                    default:
                        System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                        break;
                }
            }
        } finally {
            scanner.close(); 
        }
    }
}
