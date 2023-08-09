package udemy_java_basic_course.access_modifiers.animals;


public class Runner {
    public static void main(String[] args) {
//        Cat cat = new Cat("Yarik"); not allowed to use private constructor

//        Cat cat = new Cat(6); not allowed to use default constructor in another package
//        Cat cat = new Cat(6, "Yarik"); not allowed to use protected constructor in another package
        Yarik cat = new Yarik(6,"Yarik"); //yarik has access to protected Cat constructor
        System.out.println(cat);
        System.out.println(new Yarik());

    }
}
