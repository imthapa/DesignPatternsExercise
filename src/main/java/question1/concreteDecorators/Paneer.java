package question1.concreteDecorators;

import question1.component.Pizza;
import question1.decorators.Topping;

/**
 * Created by ishwar on 15/4/17.
 */
public class Paneer implements Topping {
    Pizza pizza;
    ;

    public Paneer() {
    }

    public Paneer(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return 20 + pizza.cost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" ,Paneer";
    }
}
