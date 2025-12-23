
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Factory (A / B): ");
        String factoryChoice = sc.nextLine();

        FoodFactory factory;
        if (factoryChoice.equalsIgnoreCase("A")) {
            factory = new FoodFactoryA();
        } else if (factoryChoice.equalsIgnoreCase("B")) {
            factory = new FoodFactoryB();
        } else {
            System.out.println("Invalid Factory Choice!");
            sc.close();
            return;
        }

        System.out.println("Choose Burger Type:");
        System.out.println("Simple | Standard | Premium");
        String burgerType = sc.nextLine();

        Burger burger = factory.createBurger(burgerType);
        Bread bread = factory.createBread();

        bread.bake();
        burger.prepare();

    }
}
