package Logica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Produto - Pizza
class Pizza {
    private String borda;
    private String sabor;
    private String tamanho;

    public void setBorda(String borda) {
        this.borda = borda;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Pizza de " + sabor + " com borda de " + borda + " - Tamanho: " + tamanho;
    }
}

// Builder Abstrato
interface PizzaBuilder {
    void reset();

    void buildSabor(String sabor);

    void buildTamanho(String tamanho);

    void buildBorda();
}

// Concrete Builders
class PizzaQueijoBuilder implements PizzaBuilder {
    private Pizza pizza;

    PizzaQueijoBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildSabor(String sabor) {
        pizza.setSabor(sabor);
    }

    @Override
    public void buildTamanho(String tamanho) {
        pizza.setTamanho(tamanho);
    }

    @Override
    public void buildBorda() {
        pizza.setBorda("queijo");
    }

    Pizza getPizza() {
        return pizza;
    }
}

// Implementações similares para PizzaCatupiryBuilder e PizzaCheddarBuilder

// Diretor
class PizzaDiretor {
    void construct(PizzaBuilder builder, String sabor, String tamanho) {
        builder.reset();
        builder.buildSabor(sabor);
        builder.buildTamanho(tamanho);
        builder.buildBorda();
    }
}

// Cliente
public class CriadorPizza {
    public static void main(String[] args) {
        PizzaDiretor diretor = new PizzaDiretor();
        List<Pizza> pedidos = new ArrayList<>(); // Lista para armazenar pedidos de pizzas

        Scanner scanner = new Scanner(System.in);

        System.out.println("Monte sua pizza!");

        String[] sabores = {"Calabresa", "Frango com Catupiry", "Marguerita"}; // Opções de sabores
        String[] tamanhos = {"Pequena", "Média", "Grande"}; // Opções de tamanhos

        for (int i = 0; i < 3; i++) { // Cria 3 pizzas com escolhas diferentes
            System.out.println("\nEscolha o sabor da pizza " + (i + 1) + ":");
            for (int j = 0; j < sabores.length; j++) {
                System.out.println((j + 1) + ". " + sabores[j]);
            }
            int escolhaSabor = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            System.out.println("Escolha o tamanho da pizza " + (i + 1) + ":");
            for (int j = 0; j < tamanhos.length; j++) {
                System.out.println((j + 1) + ". " + tamanhos[j]);
            }
            int escolhaTamanho = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            System.out.println("Escolha o tipo de borda para a pizza " + (i + 1) + ":");
            System.out.println("1. Queijo");
            System.out.println("2. Catupiry");
            System.out.println("3. Cheddar");
            int escolhaBorda = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            PizzaBuilder builder;
            switch (escolhaBorda) {
                case 1:
                    builder = new PizzaQueijoBuilder();
                    break;
                case 2:
                    builder = new PizzaCatupiryBuilder();
                    break;
                case 3:
                    builder = new PizzaCheddarBuilder();
                    break;
                default:
                    System.out.println("Opção inválida. Usando borda padrão (queijo).");
                    builder = new PizzaQueijoBuilder(); // Borda de queijo como padrão
            }

            diretor.construct(builder, sabores[escolhaSabor - 1], tamanhos[escolhaTamanho - 1]);
            if (builder instanceof PizzaQueijoBuilder) { 
            Pizza pizza = ((PizzaQueijoBuilder) builder).getPizza();
            pedidos.add(pizza); // Adiciona a pizza à lista de pedidos
            } else {
                // Lidar com a situação em que o builder não é do tipo PizzaQueijoBuilder
                System.out.println("Tipo de pizza não reconhecido. Não é possível adicionar ao pedido.");
            }
        }

        // Exibindo os pedidos realizados
        System.out.println("\nPedidos realizados:");
        for (Pizza pizza : pedidos) {
            System.out.println(pizza);
        }

        scanner.close();
    }
}




