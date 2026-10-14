package Combined.Ducks;

public class GooseAdapter extends Quackable{
    Goose goose;
    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    protected void performQuack() {
        goose.honk();
    }
}
