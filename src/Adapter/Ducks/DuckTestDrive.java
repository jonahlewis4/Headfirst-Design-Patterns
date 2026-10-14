public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck2 duck = new MallardDuck2();

        WildTurkey turkey = new WildTurkey();
        Duck2 turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("\nThe Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe duck says...");
        testDuck(duck);

        System.out.println("nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck2 duck) {
        duck.quack();
        duck.fly();
    }
}
