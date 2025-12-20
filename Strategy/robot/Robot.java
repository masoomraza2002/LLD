package robot;

import fly.FlyBehavior;
import walk.WalkBehavior;
import talk.TalkBehavior;

public abstract class Robot{
    protected FlyBehavior flyBehavior;
    protected WalkBehavior walkBehavior;
    protected TalkBehavior talkBehavior;

    public Robot(FlyBehavior flyBehavior,WalkBehavior walkBehavior,TalkBehavior talkBehavior){
        this.flyBehavior = flyBehavior;
        this.walkBehavior = walkBehavior;
        this.talkBehavior = talkBehavior;
        
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performWalk(){
        walkBehavior.walk();
    }

    public void performTalk(){
        talkBehavior.talk();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setWalkBehavior(WalkBehavior walkBehavior) {
        this.walkBehavior = walkBehavior;
    }

    public void setTalkBehavior(TalkBehavior talkBehavior) {
        this.talkBehavior = talkBehavior;
    }

    public abstract void display();
}

