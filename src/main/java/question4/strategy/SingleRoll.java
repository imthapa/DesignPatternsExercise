package question4.strategy;

/**
 * Created by ishwar on 16/4/17.
 */
public class SingleRoll implements RollBehavior {
    @Override
    public void roll() {
        System.out.println("I am single roll...");
    }
}
