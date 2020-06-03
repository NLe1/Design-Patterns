package com.github.NLe1;

import java.util.Iterator;
import java.util.List;

public class CollectionIterator implements CustomIterator {
    private Iterator collections;

    public CollectionIterator(List collections) {
        this.collections = collections.iterator();
    }

    @Override
    public Object next() {
        return collections.next();
    }

    @Override
    public boolean hasNext() {
        return collections.hasNext();
    }
}
