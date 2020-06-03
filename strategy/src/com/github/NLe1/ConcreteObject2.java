package com.github.NLe1;

public class ConcreteObject2 extends GeneralObject{
    public ConcreteObject2() {
        this.setStrategy(new ConcreteStrategy2());
    }
}
