package com.github.Ukasz09.eventObservers.observer.example;

import com.github.Ukasz09.eventObservers.observer.EventKind;
import com.github.Ukasz09.eventObservers.observer.IEventKindObserver;

public class Subscriber implements IEventKindObserver {
    private int subscriberID;

    //----------------------------------------------------------------------------------------------------------------//
    public Subscriber(int subscriberID) {
        this.subscriberID = subscriberID;
    }

    //----------------------------------------------------------------------------------------------------------------//
    @Override
    public void updateObserver(EventKind eventKind) {
        if (eventKind == EventKind.ADDED_NEW_ARTICLE)
            System.out.format("Subscriber no.%d was notified about new article!\n", subscriberID);
    }
}