package Ex8;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Pizza> pizzasDisponiveis;

    public Menu() {
        this.pizzasDisponiveis = new ArrayList<>();
    }

    public void adicionarPizza(Pizza pizza) {
        pizzasDisponiveis.add(pizza);
    }

    public List<Pizza> getPizzasDisponiveis() {
        return pizzasDisponiveis;
    }

    // Outros métodos, como removerPizza(), etc.
}
