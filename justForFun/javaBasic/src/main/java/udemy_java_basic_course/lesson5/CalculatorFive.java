package udemy_java_basic_course.lesson5;

public class CalculatorFive {

    int a;
    int b;
    int c;
    int d;

    CalculatorFive() {
        System.out.println("Constructor without parameters");
    }

    CalculatorFive(int a1) {
        a = a1;
        System.out.println("Constructor with a");
    }

    CalculatorFive(int a1, int b1) {
        this(a1);
        b = b1;
        System.out.println("Constructor with b");
    }

    public int sum() {
        return a + b + c + d;
    }
}
