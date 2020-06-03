package com.github.NLe1;

import java.util.ArrayList;
import java.util.List;

public class Subject implements SubjectInterface{
    List<ObservableEntity> entities = new ArrayList<>();
    int value = 0;

    @Override
    public void subscribeEntity(ObservableEntity entity) {
        entities.add(entity);
    }

    @Override
    public void unsubscribeEntity(ObservableEntity entity) {
        entities.remove(entity);
    }

    @Override
    public void notifyEntities() {
        for (ObservableEntity entity: entities)
            entity.update(value);
    }

    public void setValue(int newValue){
        this.value = newValue;
        notifyEntities();
    }
}
