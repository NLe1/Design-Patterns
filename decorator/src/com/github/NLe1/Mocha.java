package com.github.NLe1;

public class Mocha extends Decorator{
    public Mocha(Component wrapper){
        this.name = "Mocha";
        this.cost = 1.5;
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
