package Combined.Ducks;

import java.util.ArrayList;

public class Observable implements QuackObservable{
    ArrayList<QuackObserver> observers = new ArrayList<>();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach((o) -> {o.update(duck);});
    }
}
