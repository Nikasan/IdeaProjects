package Lambdas_01_01;

import java.util.Objects;

@FunctionalInterface
public interface MyFunctionalInterface<T> {

    T myMethod(T t1);

    default MyFunctionalInterface<T> myDefaultMethod(MyFunctionalInterface<T> t) {
        System.out.println("I am from default method");
        return Objects.requireNonNull(t);
    }
}
