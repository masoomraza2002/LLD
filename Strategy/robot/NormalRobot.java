package robot;

import fly.FlyBehavior;
import walk.WalkBehavior;
import talk.TalkBehavior;

public class NormalRobot extends Robot {

    public NormalRobot(FlyBehavior flyBehavior,
                       WalkBehavior walkBehavior,
                       TalkBehavior talkBehavior) {
        super(flyBehavior, walkBehavior, talkBehavior);
    }

    @Override
    public void display() {
        System.out.println("I am a Normal Robot");
    }
}
