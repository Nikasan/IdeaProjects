package udemy_java_basic_course.string;

public class Car {
    String color;
    String engine;

    Car(String color, String engine){
        this.color = color;
        this.engine=engine;
    }

    final static int a = 5;

    public static void main(String[] args) {

    }
}

class TestCar{
    final static Car c = new Car("red", "V8");
}