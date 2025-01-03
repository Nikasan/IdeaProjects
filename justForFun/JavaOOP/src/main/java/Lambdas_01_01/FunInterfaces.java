package Lambdas_01_01;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

        /*Lambda expressions basically express instances of functional interfaces
        (An interface with single abstract method is called functional interface.
        An example is java.lang.Runnable).
        lambda expressions implement the only abstract function and therefore implement functional interfaces
        lambda operator -> body
        (p) -> System.out.println("One parameter: " + p);*/


public class FunInterfaces {
    public static void main(String[] args) {

        MyFunctionalInterface<String> myInterface = (s) -> s + "abc";
        String str = myInterface.myMethod("s");
        MyFunctionalInterface<String> stringMyFunctionalInterface = myInterface.myDefaultMethod(myInterface);
        str = stringMyFunctionalInterface.myMethod(str);
        System.out.println(str);

        MyFunctionalInterface<Integer> intgtr = a -> {
            a = a+a;
            ++a;
            return a;
        };
        System.out.println(intgtr.myMethod(2));

        IAdd add = (x, y) -> x+y;
        IAdd multiply = (x, y) -> x*y;
        int add1 = add.add(2, 3);
        int add2 = multiply.add(2, 3);

        Predicate<String> myPre= (s)-> s.length()>3;
//        Boolean  res = myPre.test("asasd");
        Predicate<String> a = myPre.and(s -> s.startsWith("a"));
        System.out.println(a.test("4sd4"));

        //Predicate
        Predicate<String> strLength = (s) -> s.length() < 10;
        System.out.println(strLength.test("Veronika;") + "- Veronika lenght is less than 10");

        Consumer<String> consumerStr1 = (s) -> {
            System.out.println(s.toUpperCase());
        };

        consumerStr1.accept("aaa");

        Consumer<String> consumerStr2 = (s) -> {
            System.out.println(s.concat("!"));
        };

        consumerStr1.andThen(consumerStr2).accept("AAAbbb");

        Consumer<String> consumer1 = arg -> {
            System.out.println(arg + "OK");
        };

        Consumer<String> consumer2 = x -> {
            System.out.println(x + "OK!!!");
        };
        consumer1.andThen(consumer2).accept("TestConsumerAfterThen - ");

        String str1 = "Vero";
        Supplier<String> supplier = () -> str1 + "nika";
        String s = supplier.get();
        System.out.println(s);

        Function<Integer,String> fun = i -> i.toString();
        String apply = fun.apply(5);
        System.out.println("Function result: " + apply);

    }

}
