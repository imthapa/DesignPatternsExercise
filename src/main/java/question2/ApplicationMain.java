package question2;

import question2.concreteObserver.AverageScoreDisplay;
import question2.concreteObserver.CurrentScoreDisplay;
import question2.concreteSubject.CricketData;

/*
 * Suppose we are building a cricket app that notifies viewers about the information such as current score,
 * run rate etc. Suppose we have made two display elements CurrentScoreDisplay and AverageScoreDisplay.
 * CricketData has all the data (runs, bowls etc.) and whenever data changes the display elements are
 * notified with new data and they display the latest data accordingly.
 */
public class ApplicationMain {
    public static void main(String[] args) {
        CricketData cricketData = new CricketData();

        CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay(cricketData);
        AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay(cricketData);

        cricketData.updateScores(20,12,1);
        System.out.println();
        cricketData.updateScores(30,24,4);

    }
}
