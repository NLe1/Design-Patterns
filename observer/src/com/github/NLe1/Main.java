package com.github.NLe1;

public class Main {
    public static void main(String[] args) {
        //initialize the producer
        Subject producer = new Subject();

        //creating entities
        ObservableEntity entity1 = new Entity(producer, "UI");
        ObservableEntity entity2 = new Entity(producer, "Logger");
        ObservableEntity entity3 = new Entity(producer, "Analytics");
        ObservableEntity entity4 = new Entity(producer, "Search");

        producer.setValue(3);

        entity1.unsubscribe();
        entity4.unsubscribe();

        producer.setValue(10);

        entity1.subscribe();

        producer.setValue(2);
    }
}
