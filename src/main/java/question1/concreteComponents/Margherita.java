package question1.concreteComponents;

import question1.component.Pizza;

/**
 * Created by ishwar on 15/4/17.
 */
public class Margherita implements Pizza {

    String description;

    public Margherita() {
        this.description = "Margherita with";
    }

    @Override
    public int cost() {
        return 30;
    }

    public String getDescription(){
        return description;
    }
}
