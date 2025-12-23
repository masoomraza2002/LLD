// BurgerFactoryB.java
public class BurgerFactoryB extends BurgerFactory {

    @Override
    public Burger createBurger(String type) {

        if (type.equalsIgnoreCase("simple")) {
            return new SimpleBurgerB();
        }
        else if (type.equalsIgnoreCase("standard")) {
            return new StandardBurgerB();
        }
        else if (type.equalsIgnoreCase("premium")) {
            return new PremiumBurgerB();
        }
        else {
            return null;
        }
    }
}
