package udemy_java_basic_course.lesson11;

public class Runner {
    public static void main(String[] args) {
        Car car1 = new Car("Red", 2, "V4");
        Car car2 = new Car("Green", 4, "V6");

        System.out.println("car1 has doors before changing: " + car1.doors);
        changeDoors(5, car1);
        System.out.println("car1 has doors after changing: " + car1.doors);

        System.out.println(car1);
        System.out.println(car2);
        changeColors(car1,car2);
        System.out.println(car1);
        System.out.println(car2);
    }

    public static void changeDoors(int n, Car car){
        car.doors = n;
    }

    public static void changeColors(Car c1, Car c2){
        String color1 = c1.color;
        String color2 = c2.color;
        c1.color = color2;
        c2.color = color1;
    }
}
