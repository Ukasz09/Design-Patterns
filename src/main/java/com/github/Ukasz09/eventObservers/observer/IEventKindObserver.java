package com.github.Ukasz09.eventObservers.observer;

/**
 * Observer/subscriber with pattern of behaviour for specific kind of event
 */
public interface IEventKindObserver {
    void updateObserver(EventKind eventKind);
}
