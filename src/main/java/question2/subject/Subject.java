package question2.subject;

import question2.observer.DisplayElement;

/**
 * Created by ishwar on 16/4/17.
 */
public interface Subject {
    void registerObserver(DisplayElement displayElement);
    void removeObserver(DisplayElement displayElement);
    void notifyObserver();

  /*  int getRuns();
    int getBowls();
    int getWickets();*/
}
