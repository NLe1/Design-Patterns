package com.github.NLe1;

public interface ObservableEntity {
    public void update(int value);
    public void unsubscribe();
    public void subscribe();
}
