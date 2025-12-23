import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Factory:");
        System.out.println("A or B");
        String factoryChoice = sc.nextLine();

        BurgerFactory factory;

        if(factoryChoice.equals("A")){
            factory = new BurgerFactoryA();
        }
        else if(factoryChoice.equals("B")){
            factory = new BurgerFactoryB();
        }else {
            System.out.println("Invalid Factory Choice!");
            sc.close();
            return; // ✅ EXIT before using factory
        }

        System.out.println("Choose Burger Type:");
        System.out.println("Simple | Standard | Premium");
        String burgerType = sc.nextLine();

        factory.orderBurger(burgerType);
        
    }
}