
public class FoodFactoryA extends FoodFactory {

    public Burger createBurger(String type) {
        if (type.equalsIgnoreCase("simple")) {
            return new SimpleBurgerA(); 
        }else if (type.equalsIgnoreCase("standard")) {
            return new StandardBurgerA(); 
        }else if (type.equalsIgnoreCase("premium")) {
            return new PremiumBurgerA(); 
        }else {
            return null;
        }
    }

    public Bread createBread() {
        return new BreadA();
    }
}
