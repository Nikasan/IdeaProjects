package javaStatic;

/**
 * Created by Nikasan
 */
public class StaticAndConstructorsTest {

    public static void main(String[] args) {
        System.out.println(Dog.five);
        Dog d = new Dog();
        System.out.println(d.nonStatic);
    }



}
 class Dog{
    static String five = "static5";
     String nonStatic = "nonStatic5";

    Dog(){
        System.out.println("constructor");
    }
 }