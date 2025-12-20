import robot.*;
import fly.*;
import walk.*;
import talk.*;

public class Main{
    public static void main(String[] args){
        Robot rb = new NormalRobot(
            new Fly(),
            new Walk(),
            new NoTalk()
        );

        rb.display();
        rb.performFly();
        rb.performWalk();
        rb.performTalk();

        System.out.println("changinf behaviour at run time");

        rb.setFlyBehavior(new NoFly());
        rb.performFly();
    }
}