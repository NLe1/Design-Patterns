package com.github.NLe1;

public interface SubjectInterface {
    public void subscribeEntity(ObservableEntity entity);
    public void unsubscribeEntity(ObservableEntity entity);
    public void notifyEntities();
}
