package com.github.NLe1;

public interface PizzaStore {
    void createPizza(Pizza pizza);
    Pizza orderPizza(String name) throws Exception;
}
