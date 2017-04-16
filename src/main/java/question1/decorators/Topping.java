package question1.decorators;

/*
 * Suppose we are building an application for a pizza store and we need to model their pizza classes.
 * Assume they offer four types of pizzas namely Peppy Paneer, Farmhouse, Margherita  and Chicken Fiesta.
 * In addition to a pizza, customer can also ask for several toppings such as Fresh Tomato, Paneer,
 * Jalapeno, Capsicum, Barbeque, etc.Customer can choose pizza with toppings and we need to get the
 * total cost of pizza and toppings the customer chooses.
 */

import question1.component.Pizza;

public interface Topping extends Pizza {

    //String getDescription();
}
