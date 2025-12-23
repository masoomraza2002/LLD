public class BurgerFactory{
    public static Burger createBurger(String type){
        if(type.equals("Basic")){
            return new BasicBurger();
        }
        else if(type.equals("Premium")){
            return new PremiumBurger();
        }
        else if(type.equals("Standerd")){
            return new StanderdBurger();
        }else{
            return null;
        }
    }
}