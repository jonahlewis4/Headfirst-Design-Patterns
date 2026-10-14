import java.util.Arrays;

public class DuckSortTestDrive {
    public static void main (String[] args) {
        Duck3[] ducks = {
            new Duck3("Daffy", 8),
            new Duck3("Dewey", 2),
            new Duck3("Howard", 7),
            new Duck3("Louie", 2),
            new Duck3("Donald", 10),
            new Duck3("Huey", 2)
        };

        System.out.println("Before sorting:");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nAfter sorting:");
        display(ducks);
    }

    public static void display(Duck3[] ducks) {
        for(Duck3 duck : ducks) {
            System.out.println(duck);
        }
    }
}
