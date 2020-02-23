package com.github.Ukasz09.designPatternsExamples.behavioralPatterns.observer;

import java.util.HashSet;
import java.util.Set;

public class Newsletter implements INewsletterObservable {
    private Set<INewsletterSubscriber> subscribers;

    //----------------------------------------------------------------------------------------------------------------//
    public Newsletter() {
        subscribers = new HashSet<>();
    }

    public void addNewArticleAndNotifySubscriber() {
        addNewArticle();
        notifySubscribers(NewsletterEvent.ADDED_NEW_ARTICLE);
    }

    private void addNewArticle() {
        System.out.println("Added new article!");
    }

    //----------------------------------------------------------------------------------------------------------------//

    @Override
    public void attachSubscriber(INewsletterSubscriber observer) {
        subscribers.add(observer);
    }

    @Override
    public void detachSubscriber(INewsletterSubscriber observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers(NewsletterEvent newsletterEvent) {
        subscribers.forEach(observer -> observer.updateSubscriber(newsletterEvent));
    }
}
