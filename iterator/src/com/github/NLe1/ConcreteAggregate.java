package com.github.NLe1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConcreteAggregate implements Aggregate {

    private List collections;

    public ConcreteAggregate(List collections) {
        this.collections = collections;
    }

    @Override
    public CustomIterator iterator() {
        return new CollectionIterator(collections);
    }
}
