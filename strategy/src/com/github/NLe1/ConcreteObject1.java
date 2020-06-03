package com.github.NLe1;

public class ConcreteObject1 extends GeneralObject{
    public ConcreteObject1(){
        this.setStrategy(new ConcreteStrategy1());
    }
}
