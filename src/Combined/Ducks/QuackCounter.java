package Combined.Ducks;

public class QuackCounter extends Quackable {
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }


    @Override
    protected void performQuack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return  numberOfQuacks;
    }

    public String toString() {
        return duck.toString();
    }
}
