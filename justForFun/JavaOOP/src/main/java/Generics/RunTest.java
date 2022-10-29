package Generics;

public class RunTest {
    public static void main(String[] args) {
        //A generic type is a generic class or interface that is parameterized over types.
        GenericClass test1 = new GenericClass("I was born in ", 1990);
        test1.runTest();
        Boolean b = true;
        GenericClass test2 = new GenericClass("Sad but ",b);
        test2.runTest();

        GenericMethod method1 = new GenericMethod();
        method1.testMethod("I am generic");
        method1.testMethod(0.589);
        method1.testMethod(25);
    }
}
