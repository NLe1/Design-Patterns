package com.github.NLe1;

public class Whip extends Decorator{
    public Whip(Component wrapper){
        this.name = "Whip";
        this.cost = 0.3;
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

