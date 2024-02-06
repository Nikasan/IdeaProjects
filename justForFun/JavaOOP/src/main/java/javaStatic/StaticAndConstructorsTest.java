package javaStatic;

/**
 * Created by Nikasan
 */
public class StaticAndConstructorsTest {

    public static void main(String[] args) {
        System.out.println(Dog.five);
        Dog d = new Dog();
        System.out.println(d.nonStatic);

        d.nonStatic = "Changed nonStatic";
        Dog.five = "Changed static";
        System.out.println(d.nonStatic);

        System.out.println(Dog.five);

    }



}
 class Dog{
   public static String five = "static5";
    public String nonStatic = "nonStatic5";

    Dog(){
        System.out.println("constructor");
    }
 }