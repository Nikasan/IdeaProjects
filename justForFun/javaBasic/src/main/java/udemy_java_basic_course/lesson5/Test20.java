package udemy_java_basic_course.lesson5;

public class Test20 {
    //required in method return type and name, parameters (or empty) and body(except abstract)
   Test20(){}// created by compilation
    int summa(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
}

class Test21 {
    public static void main(String[] args) {
//        Test20 t = new Test20();
//        int summa = t.summa(1, 2, 3);
//        System.out.println(summa);

        CalculatorFive calculatorFive = new CalculatorFive(2,3);
        System.out.println(calculatorFive.sum());
    }
}