import java.util.Scanner;


public class MinhaBiblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha a operação:");
            System.out.println("1 - Adicionar Livro");
            System.out.println("2 - Exibir Informações de um Livro");
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
        System.out.println("Livro adicionado com sucesso.");
    }
    
    public static void exibirInformacoesLivro(Scanner scanner) {
        System.out.println("Digite o título do livro que deseja exibir:");
        scanner.nextLine(); 
        String titulo = scanner.nextLine();
        
        System.out.println("Informações do livro " + titulo + ":");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: Autor Desconhecido");
        System.out.println("Ano de Publicação: 2022");
    }
}
