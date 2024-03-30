package Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinhaBiblioteca {
    private static List<Livro> biblioteca = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha a operação:");
            System.out.println("1 - Adicionar Livro");
            System.out.println("2 - Exibir Informações de um Livro");
            System.out.println("3 - Listar Todos os Livros");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            switch (opcao) {
                case 1:
                    adicionarLivro(scanner);
                    break;
                case 2:
                    exibirInformacoesLivro(scanner);
                    break;
                case 3:
                    listarLivros();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }

    public static void adicionarLivro(Scanner scanner) {
        System.out.println("Digite o título do livro:");
        scanner.nextLine(); 
        String titulo = scanner.nextLine();

        System.out.println("Digite o autor do livro:");
        String autor = scanner.nextLine();

        System.out.println("Digite o ano de publicação do livro:");
        int anoPublicacao = scanner.nextInt();

        Livro novoLivro = new Livro(titulo, autor, anoPublicacao);
        biblioteca.add(novoLivro);
        System.out.println("Livro adicionado com sucesso.");
    }

    public static void exibirInformacoesLivro(Scanner scanner) {
        System.out.println("Digite o título do livro que deseja exibir (ou deixe em branco para cancelar):");
        scanner.nextLine(); 
        String titulo = scanner.nextLine();

        if (!titulo.isEmpty()) {
            Livro livroEncontrado = encontrarLivroPorTitulo(titulo);

            if (livroEncontrado != null) {
                System.out.println("Informações do livro " + titulo + ":");
                livroEncontrado.exibirInfo();
            } else {
                System.out.println("Livro não encontrado na biblioteca.");
            }
        }
    }

    public static void listarLivros() {
        if (biblioteca.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
        } else {
            System.out.println("Livros na biblioteca:");
            for (Livro livro : biblioteca) {
                System.out.println("- " + livro.getTitulo());
            }
        }
    }

    public static Livro encontrarLivroPorTitulo(String titulo) {
        for (Livro livro : biblioteca) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }
}
