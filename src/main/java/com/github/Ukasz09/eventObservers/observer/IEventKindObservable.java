package com.github.Ukasz09.eventObservers.observer;

/**
 * Attach and detach observers/subscribers to subject/publisher. Notify other objects about the changes to its state
 */
public interface IEventKindObservable {
    void attachObserver(IEventKindObserver observer);

    void detachObserver(IEventKindObserver observer);

    void notifyObservers(EventKind eventKind);
}
