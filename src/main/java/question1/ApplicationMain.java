package question1;

import question1.component.Pizza;
import question1.concreteComponents.ChickenFiesta;
import question1.concreteComponents.FarmHouse;
import question1.concreteComponents.Margherita;
import question1.concreteComponents.PepperPaneer;
import question1.concreteDecorators.*;

import java.util.Scanner;

/**
 * Suppose we are building an application for a pizza store and we need to model their pizza classes.
 * Assume they offer four types of pizzas namely Peppy Paneer, Farmhouse, Margherita  and Chicken Fiesta.
 * In addition to a pizza, customer can also ask for several toppings such as Fresh Tomato, Paneer, Jalapeno,
 * Capsicum, Barbeque, etc.Customer can choose pizza with toppings and we need to get the total cost of pizza
 * and toppings the customer chooses.
 */
public class ApplicationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the Pizza:(enter the corresponding number )");
        System.out.println(" 1. ChickenFiesta(50)");
        System.out.println(" 2. FarmHouse(40)");
        System.out.println(" 3. Margherita(30)");
        System.out.println(" 4. Pepper Paneer(45)");


        Pizza pizza = null;
        while (pizza == null){
            int t = scanner.nextInt();
            switch (t) {
                case 1:
                    pizza = new ChickenFiesta();
                    System.out.println("price is CF : " + pizza.cost());
                    break;
                case 2:
                    pizza = new FarmHouse();
                    System.out.println("price is FH: " + pizza.cost());
                    break;
                case 3:
                    pizza = new Margherita();
                    System.out.println("price is M : " + pizza.cost());
                    break;
                case 4:
                    pizza = new PepperPaneer();
                    System.out.println("price is PP : " + pizza.cost());
                    break;
                default:
                    System.out.println("No pizza selected.please choose one of above.");
            }
        }


        char temp = 'y';
        do {

            System.out.println("Choose the toppings:(enter the corresponding number )");
            System.out.println(" 1. Barbeque(20)");
            System.out.println(" 2. Capsicum(15)");
            System.out.println(" 3. Fresh Tomato(10)");
            System.out.println(" 4. Jalapeno(25)");
            System.out.println(" 5. Paneer(20)");
            int topping = scanner.nextInt();
            switch (topping) {
                case 1:
                    pizza = new Barbeque(pizza);
                    System.out.println("price is B : " + pizza.cost());
                    break;
                case 2:
                    pizza = new Capsicum(pizza);
                    System.out.println("price is C : " + pizza.cost());
                    break;
                case 3:
                    pizza = new FreshTomato(pizza);
                    System.out.println("price is F : " + pizza.cost());
                    break;
                case 4:
                    pizza = new Jalapeno(pizza);
                    System.out.println("price is J : " + pizza.cost());
                    break;
                case 5:
                    pizza = new Paneer(pizza);
                    System.out.println("price is P : " + pizza.cost());
                    break;
                default:
                    System.out.println("wrong input none topping selected");
            }
            System.out.println(" enter q to end toppings selection or y to add more toppings.");
            temp = scanner.next().charAt(0);
        } while (temp == 'y');

        System.out.println("final price is : " + pizza.cost() + " and pizza chosen is :" );
        System.out.println(pizza.getDescription());

    }
}
