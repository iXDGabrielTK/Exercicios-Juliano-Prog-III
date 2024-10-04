package Exer1;

import Exer1.builders.PizzaBuilder;
import Exer1.entidades.Pizza;

public class Main {
    public static void main(String[] args) {
        comBuilder();
    }

    public static void comBuilder() {
        Pizza minhaPizza = new PizzaBuilder()
                .setMassa("Fina")
                .setTamanho("Grande")
                .addIngrediente("Queijo")
                .addIngrediente("Tomate")
                .addIngrediente("Orégano")
                .addIngrediente("Pepperoni")
                .addIngrediente("Lonbinho")
                .addIngrediente("Azeitonas")
                .addIngrediente("Milho")
                .addIngrediente("Ovos")
                .addIngrediente("Palmito")
                .setBordaRecheadaDoce(true)
                .build();

        System.out.println(minhaPizza);
    }

}
