package com.github.NLe1;

public class Main {
    public static void main(String[] args) {
        Component coffee = new DarkCoffee();

        Decorator addOn = new Mocha(coffee);
        addOn = new Soy(addOn);
        addOn = new Soy(addOn);
        addOn = new Whip(addOn);

        System.out.println(addOn.getDescription());
        System.out.println(addOn.cost());
    }
}
