package com.github.Ukasz09.designPatternsExamples.observer;

public class Subscriber implements INewsletterSubscriber {
    private int subscriberID;

    //----------------------------------------------------------------------------------------------------------------//
    public Subscriber(int subscriberID) {
        this.subscriberID = subscriberID;
    }

    //----------------------------------------------------------------------------------------------------------------//
    @Override
    public void updateSubscriber(NewsletterEvent newsletterEvent) {
        if (newsletterEvent == NewsletterEvent.ADDED_NEW_ARTICLE)
            System.out.format("Subscriber no.%d was notified about new article!\n", subscriberID);
    }
}
