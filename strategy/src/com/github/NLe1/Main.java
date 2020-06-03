package com.github.NLe1;


public class Main {
    public static void main(String[] args) {
        ConcreteObject1 object1 = new ConcreteObject1();
        ConcreteObject2 object2 = new ConcreteObject2();

        //perform predefined strategy
        object1.performStrategy();
        object2.performStrategy();

        //change behaviour in the future
        object2.setStrategy(new ConcreteStrategy2());
        object1.setStrategy(new ConcreteStrategy1());
        object1.performStrategy();
        object2.performStrategy();
    }
}
