package Combined.Ducks;


public abstract class Quackable implements QuackObservable{
    QuackObservable observable;
    protected Quackable() {
        observable = new Observable(this);
    }

    protected abstract void performQuack();

    public final void quack(){
        performQuack();
        notifyObservers();
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String  toString() {
        return this.getClass().getName();
    }
}