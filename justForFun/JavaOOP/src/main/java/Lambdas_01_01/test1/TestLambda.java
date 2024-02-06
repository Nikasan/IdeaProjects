package Lambdas_01_01.test1;

import java.util.function.Predicate;

interface Ifunction {

    boolean test(String s);
}

public class TestLambda {

    public static void main(String[] args) {
        String s = "String";

        testMethod1(s, (String st) -> st.length() > 10);
        testMethod2(s, (String st) -> st.length() < 10);
    }

    static void testMethod1(String s, Ifunction f) {
        System.out.println(f.test(s));
    }

    static void testMethod2(String s, Predicate<String> t) {
        System.out.println(t.test(s));
    }
}