public class DuckAdapter implements Turkey {
    private Duck2 duck;
    public DuckAdapter(Duck2 duck) {
        this.duck = duck;
    }
    @Override
    public void gobble() {
        duck.quack();
    }

    int flyFrame = 0;
    @Override
    public void fly() {
        if(flyFrame == 0) {
            duck.fly();
        }
        flyFrame++;
        flyFrame %= 5;
    }
}
