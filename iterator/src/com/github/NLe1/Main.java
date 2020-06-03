package com.github.NLe1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {1,2,4,5,7,3,2};
        List<Object> myList = new ArrayList<>(Arrays.asList(1232,4,12,51,346,346,23,23));

        Aggregate myArrayAggregator = new ConcreteAggregate(List.of(myArray));
        Aggregate myListAggregator = new ConcreteAggregate(myList);

        CustomIterator arrayIter = myArrayAggregator.iterator();
        CustomIterator listIter = myListAggregator.iterator();

        while(arrayIter.hasNext()){
            System.out.println("Item: " + arrayIter.next().toString());
        }

        while(listIter.hasNext()){
            System.out.println("Item: " + arrayIter.next().toString());
        }
    }
}
