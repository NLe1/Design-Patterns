package com.github.NLe1;

public class ConcreteStrategy1 implements AbstractStrategy{
    @Override
    public void abstractMethod() {
        System.out.println("Instance of class " + this.getClass().getName() + " is carrying out the specific strategy / behaviour number one ...");
    }
}
