package Ex6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Contato> listaContatos = new ArrayList<>();

        boolean opcao = true;
        int selecione;

        while (opcao) {
            System.out.println("\nInforme a opção desejada: ");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Exibir contatos");
            System.out.println("3 - Buscar contato");
            System.out.println("4 - Remover contato");
            System.out.println("0 - Encerrar programa");
        
            selecione = scanner.nextInt();
            scanner.nextLine(); // Consumindo a quebra de linha

            switch (selecione) {
                case 1:
                    System.out.println("Insira o nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.println("Insira o telefone do contato: ");
                    String telefone = scanner.nextLine();
                    Contato novoContato = new Contato(nome, telefone);
                    listaContatos.add(novoContato);
                    System.out.println("Contato adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("Informações dos contatos: "); 
                    for (Contato c : listaContatos) {
                        c.exibirContato();
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Informe o nome do contato desejado: ");
                    String nomeBusca = scanner.nextLine();
                    boolean encontrado = false;
                    for (Contato c : listaContatos) {
                        if (c.getNome().equals(nomeBusca)) {
                            c.exibirContato(); // Exibir o contato encontrado
                            encontrado = true;
                            break; // Parar a busca após encontrar o contato
                        }
                    }
                    if (!encontrado) {
                        System.err.println("Contato não encontrado!");
                    }
                    break;
                case 4:
                    System.out.println("Informe o nome do contato que deseja remover: ");
                    String nomeRemover = scanner.nextLine();
                    Iterator<Contato> iterator = listaContatos.iterator();
                    boolean removido = false;
                    while (iterator.hasNext()) {
                        Contato c = iterator.next();
                        if (c.getNome().equals(nomeRemover)) {
                            iterator.remove(); // Remove o contato usando o iterador
                            removido = true;
                            System.out.println("Contato removido com sucesso!");
                            break;
                        }
                    }
                    if (!removido) {
                        System.err.println("Contato não encontrado!");
                    }
                    break;
                
                case 0:
                    opcao = false;
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        scanner.close();
    }
}
