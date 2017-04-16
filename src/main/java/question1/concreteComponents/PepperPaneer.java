package question1.concreteComponents;

import question1.component.Pizza;

/**
 * Created by ishwar on 15/4/17.
 */
public class PepperPaneer implements Pizza {

    String description;

    public PepperPaneer() {
        this.description = "Pepper Paneer with";
    }

    @Override
    public int cost() {
        return 45;
    }

    public String getDescription(){
        return description;
    }
}
