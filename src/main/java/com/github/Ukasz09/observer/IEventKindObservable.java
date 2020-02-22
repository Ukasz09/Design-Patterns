package com.github.Ukasz09.observer;


public interface IEventKindObservable {
    /**
     * Attach observers/subscribers to subject/publisher
     */
    void attachObserver(IEventKindObserver observer);

    /**
     * Detach observers/subscribers to subject/publisher
     */
    void detachObserver(IEventKindObserver observer);

    /**
     * Notify observers/subscribers about the changes to its state
     *
     * @param eventKind define kind of event/state changes in subject/publisher, for specific behaviours of subscribers/observers
     */
    void notifyObservers(EventKind eventKind);
}
