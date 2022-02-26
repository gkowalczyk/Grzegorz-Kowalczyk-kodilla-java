package com.kodilla.patterns2.observer.forum;

interface Observable { // interfejs do subskrybowania obserwatorów w obiektach klasy

    void registerObserver(Observer observer);
    void notifyObservers();
    void removeObserver(Observer observer);
}
