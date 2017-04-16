package question2.concreteObserver;

import question2.concreteSubject.CricketData;
import question2.observer.DisplayElement;

/**
 * Created by ishwar on 16/4/17.
 */
public class AverageScoreDisplay implements DisplayElement {
    double runs;
    int expectedRuns;
    int bowls;
    int wickets;
    private CricketData cricketData;

    public AverageScoreDisplay(CricketData cricketData) {
        this.cricketData = cricketData;
        this.cricketData.registerObserver(this);
    }

    @Override
    public void update(int runs, int bowls, int wickets) {
        this.runs = (runs / (double)(bowls / 6));
        expectedRuns = (int)(this.runs * 50);
        this.bowls = bowls;
        this.wickets = wickets;
        display();
    }

    @Override
    public void display() {
        System.out.println("AverageScore : ");
        System.out.println("    runs/over     : " + runs);
        System.out.println("    expected runs : " + expectedRuns);
    }
}
