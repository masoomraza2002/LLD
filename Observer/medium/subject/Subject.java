package medium.subject;

import medium.observer.Observer;

public  interface  Subject{
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
}