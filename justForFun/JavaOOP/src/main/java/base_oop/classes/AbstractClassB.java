package base_oop.classes;

public abstract class AbstractClassB extends AbstractClassA{

    public AbstractClassB() {
    }

    public static void absMethod(){
        System.out.println("Static method in abstract class");
    }

    public final void fMethod(){}
}
