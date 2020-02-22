package com.github.Ukasz09.eventObservers.observer.example;

public class Main {
    public static void main(String[] args) {
        Newsletter newsletter = new Newsletter();
        newsletter.attachObserver(new Subscriber(1));
        newsletter.attachObserver(new Subscriber(2));
        newsletter.attachObserver(new Subscriber(3));

        newsletter.addNewArticleAndNotifySubscriber();
        newsletter.addNewArticleAndNotifySubscriber();
    }
}