package ch09.ricky.observer;

import ch09.ricky.observer.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void notifyObservers(String tweet);
}
