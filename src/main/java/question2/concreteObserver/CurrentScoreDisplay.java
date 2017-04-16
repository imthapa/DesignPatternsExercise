package question2.concreteObserver;

import question2.concreteSubject.CricketData;
import question2.observer.DisplayElement;

/**
 * Created by ishwar on 16/4/17.
 */
public class CurrentScoreDisplay implements DisplayElement {

    int runs;
    int bowls;
    int wickets;
    private CricketData cricketData;

    public CurrentScoreDisplay(CricketData cricketData) {
        this.cricketData = cricketData;
        this.cricketData.registerObserver(this);
    }

    @Override
    public void update(int runs, int bowls, int wickets) {
        this.runs = runs;
        this.bowls = bowls;
        this.wickets = wickets;
        display();
    }

    @Override
    public void display() {
        System.out.println("CurrentScore : ");
        System.out.println("    runs    : " + runs);
        System.out.println("    bowls   : " + bowls);
        System.out.println("    wickets : " + wickets);
    }
}
