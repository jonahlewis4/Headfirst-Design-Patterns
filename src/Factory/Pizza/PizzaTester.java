public class PizzaTester {
    public static void main(String[] args) {
        String pizzaType = "cheese";
        PizzaStore chiStore = new ChicagoPizzaStore();
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore caliStore = new CaliforniaPizzaStore();

        Pizza pizza = nyStore.orderPizza(pizzaType);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chiStore.orderPizza(pizzaType);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizzaType = "clam";
        pizza = caliStore.orderPizza(pizzaType);
        System.out.println("Emma ordered a " + pizza.getName() + "\n");

    }
}
