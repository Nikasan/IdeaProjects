package javaStatic;

public class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.nonStatic);
        System.out.println(Dog.five);
    }
}
