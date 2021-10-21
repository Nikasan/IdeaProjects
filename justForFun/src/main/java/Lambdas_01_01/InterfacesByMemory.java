package Lambdas_01_01;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfacesByMemory {
    public static void main(String[] args) {
        MyFunctions.fromFunction();
        MyFunctions.fromPredicate();
        MyFunctions.fromSupplier();
        MyFunctions.fromConsumer();
        MyFunctions.fromMyInterface();

    }

    public static class MyFunctions {

        public static void fromFunction() {
            Function<String, Integer> fun = String::length;
            Integer i = fun.apply("EPAM");
            System.out.println(i);
        }

        public static void fromPredicate() {
            String str = "Veronika";
            Predicate<String> predicate = s -> s.length() > 2;
            boolean veronika = predicate.test(str);
            System.out.println(str + " more than 3 symbols is " + veronika);
        }

        public static void fromSupplier() {
            Supplier<String> supplier1 = () -> "Return value from supplier";
            Supplier<Integer> supplier2 = () -> 25 / 4;
            String s = supplier1.get();
            Integer i = supplier2.get();
            System.out.println(s);
            System.out.println(i);
        }

        public static void fromConsumer() {
            Consumer<String> consumer = System.out::println;
            String city = "Praha";
            consumer.accept(city);
        }

        public static void fromMyInterface(){
            MyFunctionalInterface <String> my = (s) -> s + "Ping from my interface";
            System.out.println(my.myMethod("Hello! "));
        }
    }
}
