package question1.concreteComponents;

import question1.component.Pizza;

/**
 * Created by ishwar on 15/4/17.
 */
public class ChickenFiesta implements Pizza {

    String description;

    public ChickenFiesta() {
        this.description = "Chicken Fiesta with";
    }

    @Override
    public int cost() {
        return 50;
    }

    public String getDescription(){
        return description;
    }
}
