package question1.concreteDecorators;

import question1.component.Pizza;
import question1.decorators.Topping;

/**
 * Created by ishwar on 15/4/17.
 */
public class Capsicum implements Topping {
    Pizza pizza;

    public Capsicum() {

    }

    public Capsicum(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return 15 + pizza.cost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" ,Capsicum";
    }
}
