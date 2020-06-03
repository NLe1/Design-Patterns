package com.github.NLe1;

public class DarkCoffee implements Component {
    private int price;

    @Override
    public String getDescription() {
        return "Dark Coffee";
    }

    @Override
    public double cost() {
        return price;
    }
}
