package fly;

public class NoFly implements FlyBehavior{
    public void fly(){
        System.out.println("Robot cannot Fly");
    }
}