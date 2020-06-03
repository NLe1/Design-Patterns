package com.github.NLe1;

public class Entity implements ObservableEntity {
    int entityValue = 0;
    SubjectInterface subject;
    String entityName;

    public Entity(SubjectInterface subject, String entityName) {
        System.out.println("Creating new entity: " + entityName);
        this.subject = subject;
        this.entityName = entityName;
        this.subscribe();
    }

    @Override
    public void update(int value) {
        this.entityValue = value;
        System.out.println(entityName + " got updated from producer... New value: " + entityValue);
    }

    @Override
    public void unsubscribe() {
        System.out.println("Unsubscribing " + entityName + " from the producer ...");
        subject.unsubscribeEntity(this);
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribing: " + entityName + " to producer ...");
        subject.subscribeEntity(this);
    }
}
