package udemy_java_basic_course.lesson11;

public class Car {
    public String color;
    public int doors;
    public String engine;

    Car(String color, int doors, String engine){
        this.color = color;
        this.doors = doors;
        this.engine = engine;
    }

    @Override
    public String toString(){
        return "Color: "+ color + ", doors: "+ doors + ", engine: " + engine;
    }
}
