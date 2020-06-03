package com.github.NLe1;

public class Main {
    public static void main(String[] args) {
        NYStylePizzaStore nyStore = new NYStylePizzaStore();
        ChicagoStylePizzaStore chicagoStore = new ChicagoStylePizzaStore();

        try {
            nyStore.orderPizza("cheese");
            nyStore.orderPizza("clam");
            nyStore.orderPizza("pepperoni");
            nyStore.orderPizza("veggie");

            chicagoStore.orderPizza("cheese");
            chicagoStore.orderPizza("clam");
            chicagoStore.orderPizza("pepperoni");
            chicagoStore.orderPizza("veggie");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
