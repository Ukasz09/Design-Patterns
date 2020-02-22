package com.github.Ukasz09.mediator;

/**
 * Declare methods of communication with components
 */
public interface IMediator {

    /**
     * Do action according to sender and event type
     *
     * @param sender    - components which triggered event
     * @param eventType - type of event triggered by component
     */
    void notify(IComponent sender, EventType eventType);
}
