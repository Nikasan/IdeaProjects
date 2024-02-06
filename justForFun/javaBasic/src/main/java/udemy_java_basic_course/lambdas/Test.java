package udemy_java_basic_course.lambdas;

public class Test {

    public static void main(String[] args) {
//        TestInferenceType tit = new TestInferenceType();
        var tit = new TestInferenceType(); // only for local variables
    }
}

interface I{
    void abs();

    default void def(){}
    default void def1(){}
    default void def2(){}
    static void def3(){}
}