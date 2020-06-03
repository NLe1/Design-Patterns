package com.github.NLe1;

public class GeneralObject {
    private AbstractStrategy strategy;

    public GeneralObject() {
        this.strategy = new ConcreteStrategy1();
    }

    public void performStrategy() {
        this.strategy.abstractMethod();
    }

    public void setStrategy(AbstractStrategy newStrategy){
        this.strategy = newStrategy;
    }

    public void otherTask() {
        System.out.println("Performing other tasks that is share behaviours amongst the instances");
    }
}
