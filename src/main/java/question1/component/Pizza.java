package question1.component;

/**
 * Suppose we are building an application for a pizza store and we need to model their pizza classes.
 * Assume they offer four types of pizzas namely Peppy Paneer, Farmhouse, Margherita  and Chicken Fiesta.
 * In addition to a pizza, customer can also ask for several toppings such as Fresh Tomato, Paneer,
 * Jalapeno, Capsicum, Barbeque, etc.Customer can choose pizza with toppings and we need to get the
 * total cost of pizza and toppings the customer chooses.
 */

/**
 * Its component interface.
 */
public interface Pizza {

    int cost();

    default String getDescription(){
        return "unknown pizza";
    }
}
