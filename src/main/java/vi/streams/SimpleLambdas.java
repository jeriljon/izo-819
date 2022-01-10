package vi.streams;

import java.util.ArrayList;
import java.util.List;

/**
 * Lambda expression is a block of code that gets passed around.
 * A lambda expression is a short block of code which takes in parameters and returns a value.
 * Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
 * Lambdas work with functional interfaces that have only one abstract method
 */

public class SimpleLambdas {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        // pass class that does the check
        print(animals, new CheckIfHopper());

        // pass lambda that does the check
        print(animals, animal -> animal.canHop());
        print(animals, animal -> animal.canSwim());
        print(animals, animal -> !animal.canSwim());
    }

    public static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            // the general check
            if (checker.test(animal)) {
                System.out.println(animal + " ");
            }
            System.out.println();
        }
    }
}

class CheckIfHopper implements CheckTrait {
    public boolean test(Animal animal){
        return animal.canHop();
    }
}

/**
 * Animal class has 3 instance variables, which are set in the constructor.
 * It has 2 methods to get the state of the Animal, where the animal can hop or swim.
 * It also has a toString() method so that we can easily identify the Animal in programs.
 */
class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }

    public boolean canHop() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String toString() {
        return species;
    }
}

interface CheckTrait {
    boolean test(Animal animal);
}
