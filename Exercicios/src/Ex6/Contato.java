package Ex6;

public class Contato {

    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public void exibirContato() {
        if (nome != null && !nome.isEmpty() && telefone != null && !telefone.isEmpty()) {
            System.out.println("Contato: " + nome);
            System.out.println("Telefone: " + telefone);
        } else {
            System.out.println("Nenhum contato adicionado.");
        }
    }

    public void buscarContato(String nomeContato) {
        if (nome != null && nome.equals(nomeContato)) {
            System.out.println("Contato encontrado: ");
            System.out.println("Nome: " + nome);
            System.out.println("Telefone: " + telefone);
        } else {
            System.err.println("Contato não encontrado!");
        }
    }

    public String getNome() {
        return nome;
    }
}