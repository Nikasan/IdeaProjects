package HashCodeEqualsPackage;

import java.util.HashSet;
import java.util.Set;

/**
 * == is a reference comparison, i.e. both objects point to the same memory location .equals() evaluates to the comparison of values in the objects, If no
 * parent classes have provided an override equals()
 *
 * remember to override hashCode if you override equals so as not to "break the contract". As per the API, the result returned from the hashCode() method for
 * two objects must be the same if their equals methods show that they are equivalent.
 */

public class Runner {

    public static void main(String[] args) {
        Object dog1 = new Dog();
        Object dog2 = new Dog();
        System.out.println("Dog1 hashCode(): " + dog1.hashCode());
        System.out.println("Dog2 hashCode(): " + dog2.hashCode());
        System.out.println("Equals(): " + dog1.equals(dog2));
        System.out.println("Operator == : " + dog1 == dog2);

        System.out.println("-----------------------------------");
        Cat yarik1 = new Cat("Yarik", 4);
        Cat yarik2 = new Cat("Yarik", 4);

        System.out.println("Yarik1 hashCode(): " + yarik1.hashCode());
        System.out.println("Yarik2 hashCode(): " + yarik2.hashCode());

        Set<Cat> cats = new HashSet<>();
        cats.add(yarik1);
        cats.add(yarik2);
        boolean equals = yarik1.equals(yarik2);
        System.out.println(cats );

        System.out.println(equals);

    }
}
