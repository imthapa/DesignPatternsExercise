package question4.context;

import question4.strategy.JumpBehavior;
import question4.strategy.RollBehavior;

/**
 * Created by ishwar on 16/4/17.
 */
public abstract class StreetFighter {

    protected JumpBehavior jumpBehavior;
    protected RollBehavior rollBehavior;

    public abstract void punch();

    public abstract void kick();

    public abstract void sayLevel();

    public void performJump() {
        jumpBehavior.jump();
    }

    public void performRoll() {
        rollBehavior.roll();
    }


}
