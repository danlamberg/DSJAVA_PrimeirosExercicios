package Ex8;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pizzaria {
    private List<Pizza> menu;
    private List<Pedido> pedidos;

    public Pizzaria() {
        this.menu = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPizza(Pizza pizza) {
        menu.add(pizza);
    }

    public void realizarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void cancelarPedido(Pedido pedido) {
        pedidos.remove(pedido);
    }

    public List<Pizza> getMenu() {
        return menu;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public double calcularMediaPrecoPedidos() {
        if (pedidos.isEmpty()) {
            return 0.0;
        }

        double total = 0;
        for (Pedido pedido : pedidos) {
            total += pedido.getPreco();
        }

        return total / pedidos.size();
    }

    public double calcularMediaPrecoPizzas() {
        if (menu.isEmpty()) {
            return 0.0;
        }

        double total = 0;
        for (Pizza pizza : menu) {
            total += pizza.getPreco();
        }

        return total / menu.size();
    }

    public void imprimirValoresMedios() {
        double mediaPrecoPizzas = calcularMediaPrecoPizzas();
        DecimalFormat df = new DecimalFormat("#.00"); // Formato para duas casas decimais
        System.out.println("Valor médio das pizzas: R$ " + df.format(mediaPrecoPizzas));
    }

    public void iniciarAtendimento() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        // Adicionar pizzas ao menu
        adicionarPizza(new Pizza("Mussarela", 30.0, "Queijo, molho de tomate"));
        adicionarPizza(new Pizza("Calabresa", 35.0, "Calabresa, queijo, molho de tomate"));

        do {
            exibirMenuPizzas();

            // Solicitar ao usuário os detalhes do pedido
            System.out.println("Escolha a pizza pelo número:");
            int escolhaPizza = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após o número

            if (escolhaPizza == menu.size() + 1) {
                adicionarNovoSabor(scanner);
                continue;
            }

            Pizza pizzaEscolhida = menu.get(escolhaPizza - 1);
            System.out.println("Pizza escolhida: " + pizzaEscolhida.getNome() + ", Preço: R$ " + formatarValor(pizzaEscolhida.getPreco()));

            System.out.println("Digite o endereço de entrega:");
            String enderecoEntrega = scanner.nextLine();

            // Criar e adicionar o pedido
            Pedido novoPedido = new Pedido(pizzaEscolhida, enderecoEntrega);
            realizarPedido(novoPedido);

            // Perguntar ao usuário se deseja adicionar outro pedido
            System.out.println("Deseja adicionar outro pedido? (S/N)");
            String resposta = scanner.nextLine();
            continuar = resposta.equalsIgnoreCase("S");
        } while (continuar);

        // Imprimir os pedidos existentes
        List<Pedido> pedidos = getPedidos();
        System.out.println("Pedidos existentes:");
        for (Pedido p : pedidos) {
            System.out.println("Pizza: " + p.getPizza().getNome() + ", Endereço de entrega: " + p.getEnderecoEntrega());
        }

        // Imprimir o valor médio das pizzas
        imprimirValoresMedios();

        // Fechar o scanner
        scanner.close();
    }

    private void exibirMenuPizzas() {
        System.out.println("Menu de Pizzas:");
        for (int i = 0; i < menu.size(); i++) {
            Pizza pizza = menu.get(i);
            System.out.println((i + 1) + ". " + pizza.getNome() + " - R$ " + formatarValor(pizza.getPreco()));
        }
        System.out.println((menu.size() + 1) + ". Adicionar novo sabor");
    }

    private void adicionarNovoSabor(Scanner scanner) {
        System.out.println("Digite o nome do novo sabor:");
        String nome = scanner.nextLine();
        System.out.println("Digite o preço do novo sabor:");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha após o número
        System.out.println("Digite os ingredientes do novo sabor:");
        String ingredientes = scanner.nextLine();

        adicionarPizza(new Pizza(nome, preco, ingredientes));
        System.out.println("Novo sabor adicionado com sucesso!");
    }

    private String formatarValor(double valor) {
        DecimalFormat df = new DecimalFormat("#.00"); // Formato para duas casas decimais
        return df.format(valor);
    }

    public static void main(String[] args) {
        Pizzaria pizzaria = new Pizzaria();
        pizzaria.iniciarAtendimento();
    }
}
