package udemy_java_basic_course.lambdas.test1;

public class Test1 {

    public static void main(String[] args) {
        FunInterface fun1 = (Integer a, Integer b) -> a+b;
        fun1.operation(4,5);


    }

}
