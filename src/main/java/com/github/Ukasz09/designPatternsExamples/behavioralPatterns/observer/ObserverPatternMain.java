package com.github.Ukasz09.designPatternsExamples.behavioralPatterns.observer;

public class ObserverPatternMain {
    public static void main(String[] args) {
        Newsletter newsletter = new Newsletter();
        newsletter.attachSubscriber(new Subscriber(1));
        newsletter.attachSubscriber(new Subscriber(2));
        newsletter.attachSubscriber(new Subscriber(3));

        newsletter.addNewArticleAndNotifySubscriber();
        newsletter.addNewArticleAndNotifySubscriber();
    }
}
