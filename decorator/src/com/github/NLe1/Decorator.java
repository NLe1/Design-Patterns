package com.github.NLe1;

public abstract class Decorator implements Component {
    protected String name;
    protected double cost;
    Component wrapper;
}
