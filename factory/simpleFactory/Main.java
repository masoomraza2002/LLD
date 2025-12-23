import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to burger shop \n press Basic or Premium or Standerd");

        System.out.println("Enter your choice");
        String choice =  s.nextLine();

        Burger burger = BurgerFactory.createBurger(choice);
        burger.prepare();
        
    }
}