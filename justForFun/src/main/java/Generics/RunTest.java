package Generics;

public class RunTest {
    public static void main(String[] args) {
        Test test1 = new Test("I was born in ", 1990);
        test1.runTest();
        Boolean b = true;
        Test test2 = new Test("Sad but ",b);
        test2.runTest();

        TestMethod method1 = new TestMethod();
        method1.testMethod("I am generic");
        method1.testMethod(0.589);
        method1.testMethod(25);
    }
}
