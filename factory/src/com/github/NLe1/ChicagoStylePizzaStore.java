package com.github.NLe1;

public class ChicagoStylePizzaStore implements PizzaStore {

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
            case "cheese" -> newPizza = new ChicagoStyleCheesePizza();
            case "veggie" -> newPizza = new ChicagoStyleVeggiePizza();
            case "clam" -> newPizza = new ChicagoStyleClamPizza();
            case "pepperoni" -> newPizza = new ChicagoStylePepperoniPizza();
            default -> throw new Exception("name is not valid");
        }
        return newPizza;
    }
}
