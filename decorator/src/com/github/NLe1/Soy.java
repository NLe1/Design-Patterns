package com.github.NLe1;

public class Soy extends Decorator{
    public Soy(Component wrapper){
        this.name = "Soy";
        this.cost = 0.7;
        this.wrapper = wrapper;
    }
    @Override
    public String getDescription() {
        return wrapper.getDescription() + ", " + this.name;
    }

    @Override
    public double cost() {
        return wrapper.cost() + this.cost;
    }
}
