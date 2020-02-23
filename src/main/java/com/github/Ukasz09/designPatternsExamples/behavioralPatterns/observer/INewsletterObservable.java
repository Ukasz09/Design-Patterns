package com.github.Ukasz09.designPatternsExamples.behavioralPatterns.observer;


public interface INewsletterObservable {
    void attachSubscriber(INewsletterSubscriber observer);

    void detachSubscriber(INewsletterSubscriber observer);

    void notifySubscribers(NewsletterEvent newsletterEvent);
}
