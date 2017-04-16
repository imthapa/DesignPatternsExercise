package question4.concreteStrategy;

import question4.context.StreetFighter;
import question4.strategy.DoubleRoll;
import question4.strategy.LongJump;

/**
 * Created by ishwar on 16/4/17.
 */
public class Level2Fighter extends StreetFighter {

    public Level2Fighter(){
        jumpBehavior = new LongJump();
        rollBehavior = new DoubleRoll();
    }

    @Override
    public void punch() {
        System.out.println("Punch remains same...");
    }

    @Override
    public void kick() {
        System.out.println("Kick is same...");
    }

    @Override
    public void sayLevel() {
        System.out.println("Welcome to level 2...");
    }
}
