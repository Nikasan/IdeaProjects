package SpringStart;

import org.springframework.stereotype.Component;

@Component
public class Car {
    public Car() {
        System.out.println("SpringStart.Car instantiated");
    }

    public void getCar() {
        System.out.println("Toyota");

    }
}