package com.github.NLe1;

public class NYStylePizzaStore implements PizzaStore {

    @Override
    public void createPizza(Pizza pizza) {
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    @Override
    public Pizza orderPizza(String name) throws Exception{
        Pizza newPizza;
        switch(name){
            case "cheese" -> newPizza = new NYStyleCheesePizza();
            case "veggie" -> newPizza = new NYStyleVeggiePizza();
            case "clam" -> newPizza = new NYStyleClamPizza();
            case "pepperoni" -> newPizza = new NYStylePepperoniPizza();
            default -> throw new Exception("name is not valid");
        }
        return newPizza;
    }
}
