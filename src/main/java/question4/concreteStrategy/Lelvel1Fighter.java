package question4.concreteStrategy;

import question4.context.StreetFighter;
import question4.strategy.HighJump;
import question4.strategy.SingleRoll;

/**
 * Created by ishwar on 16/4/17.
 */
public class Lelvel1Fighter extends StreetFighter {

    public Lelvel1Fighter() {
        jumpBehavior = new HighJump();
        rollBehavior = new SingleRoll();
    }

    @Override
    public void punch() {
        System.out.println("Punch is basic...");
    }

    @Override
    public void kick() {

        System.out.println("Kick is basic...");
    }

    @Override
    public void sayLevel() {
        System.out.println("Welcome to level 1...");
    }
}
