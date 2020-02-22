package com.github.Ukasz09.eventObservers.observer.example;

import com.github.Ukasz09.eventObservers.observer.EventKind;
import com.github.Ukasz09.eventObservers.observer.IEventKindObservable;
import com.github.Ukasz09.eventObservers.observer.IEventKindObserver;

import java.util.HashSet;
import java.util.Set;

public class Newsletter implements IEventKindObservable {
    private Set<IEventKindObserver> observers;

    //----------------------------------------------------------------------------------------------------------------//
    public Newsletter() {
        observers = new HashSet<>();
    }

    public void addNewArticleAndNotifySubscriber() {
        addNewArticle();
        notifyObservers(EventKind.ADDED_NEW_ARTICLE);
    }

    private void addNewArticle() {
        System.out.println("Added new article!");
    }

    //----------------------------------------------------------------------------------------------------------------//

    @Override
    public void attachObserver(IEventKindObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detachObserver(IEventKindObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(EventKind eventKind) {
        observers.forEach(observer -> observer.updateObserver(eventKind));
    }
}
