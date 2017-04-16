package question1.concreteComponents;

import question1.component.Pizza;

/**
 * Created by ishwar on 15/4/17.
 */
public class FarmHouse implements Pizza {

    String description;;

    public FarmHouse() {
        this.description = "FarmHouse with";
    }

    @Override
    public int cost() {
        return 40;
    }

    public String getDescription(){
        return description;
    }
}
