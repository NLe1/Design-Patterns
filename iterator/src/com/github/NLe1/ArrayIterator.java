package com.github.NLe1;

public class ArrayIterator implements CustomIterator {
    private int[] collections;
    int index = 0;

    public ArrayIterator(int[] collections) {
        this.collections = collections;
    }

    @Override
    public Integer next() {
        if(this.index >= collections.length)
            return Integer.MAX_VALUE;
        else
            return collections[index++];
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}
