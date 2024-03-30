package Ex8;

public class Pedido {
    private Pizza pizza;
    private String enderecoEntrega;

    public Pedido(Pizza pizza, String enderecoEntrega) {
        this.pizza = pizza;
        this.enderecoEntrega = enderecoEntrega;
    }

    public double getPreco() {
        return pizza.getPreco();
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }
}
