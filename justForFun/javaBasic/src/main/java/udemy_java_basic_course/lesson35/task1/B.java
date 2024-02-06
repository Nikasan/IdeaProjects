package udemy_java_basic_course.lesson35.task1;

public class B extends A{
    public int a=20;

    @Override
    public void abc() {
        System.out.println("child non-static");
    }

    public static void abc2(){
        System.out.println("child static");
    }

    public static void main(String[] args) {
        B b = new B();

        System.out.println(b.a);
        System.out.println(((A) b).a);
        b.abc();
        ((A) b).abc();//runtime checked that it is object of B
        b.abc2();
        ((A)b).abc2();
    }
}
