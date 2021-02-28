package com.hau.bui.learning.eventsourcingaxonspringboot.base;

public class BaseEvent<T> {

    public final T id;

    public BaseEvent(T id) {
        this.id = id;
    }

}
