package question2.concreteSubject;

import question2.observer.DisplayElement;
import question2.subject.Subject;

import java.util.ArrayList;

/*
 * Suppose we are building a cricket app that notifies viewers about the information such as current score,
 * run rate etc. Suppose we have made two display elements CurrentScoreDisplay and AverageScoreDisplay.
 * CricketData has all the data (runs, bowls etc.) and whenever data changes the display elements are
 * notified with new data and they display the latest data accordingly.
 */
public class CricketData implements Subject{

    ArrayList<DisplayElement> elements ;
    int runs;
    int bowls;
    int wickets;

    public CricketData() {
        elements = new ArrayList();
    }

    @Override
    public void registerObserver(DisplayElement displayElement) {
        elements.add(displayElement);
    }

    @Override
    public void removeObserver(DisplayElement displayElement) {
        int index = elements.indexOf(displayElement);
        if (index >= 0)
            elements.remove(index);
    }

    @Override
    public void notifyObserver() {
        for (DisplayElement element:elements
             ) {
            element.update(runs,bowls,wickets);
        }
    }

    public void scoreChanged(){
        notifyObserver();
    }

    public void updateScores(int runs,int bowls,int wickets){
        this.runs = runs;
        this.bowls = bowls;
        this.wickets = wickets;
        scoreChanged();
    }

}
