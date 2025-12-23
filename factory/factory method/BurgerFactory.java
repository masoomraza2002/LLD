public abstract class BurgerFactory{
    public abstract Burger createBurger(String type);

    public void orderBurger(String type){
        Burger burger = createBurger(type);
        burger.prepare();
    }
    
}