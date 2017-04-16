package question4.strategy;

/**
 * Created by ishwar on 16/4/17.
 */
public class DoubleRoll implements RollBehavior {
    @Override
    public void roll() {
        System.out.println("I am double roll...");
    }
}
