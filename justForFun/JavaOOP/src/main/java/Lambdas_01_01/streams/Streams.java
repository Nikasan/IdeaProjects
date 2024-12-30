package Lambdas_01_01.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Nikasan
 */
    /*
    Stream API has two types of methods:  intermediate operation(s) and a terminal operation.
    Intermediate operations return a new modified stream.
     Stream<T> filter(Predicate<? super T> predicate);
 <R> Stream<R> map(Function<? super T, ? extends R> mapper);
    Stream<T> distinct();
    Stream<T> peek(Consumer<? super T> action);
    Stream<T> sorted(Comparator<? super T> comparator);

    At the end we need to use ONE! terminal operation:

    T reduce(T identity, BinaryOperator<T> accumulator);
    void forEach(Consumer<? super T> action);
      <R, A> R collect(Collector<? super T, A, R> collector);
       default List<T> toList()
     */
public class Streams {

    public static void main(String[] args) {

        List<Integer> integerList = List.of(2,4,6,8);
        System.out.println(divideCountListElements(integerList,2));
    divideListElements(integerList,2);
        /*
        Reduce has 3 blocks
        Identity - start value and end value if stream empty
        Accumulator - function that takes 2 param, partial result and next stream element
        Combiner - функция для объединения результатов если парарельный стрим, или функция решающая разницу между типами в аккумуляторе
        Optional<T> reduce(BinaryOperator<T> accumulator)
        T reduce(T identity, BinaryOperator<T> accumulator)
        U reduce(U identity, BiFunction<U,? super T,U> accumulator, BinaryOperator<U> combiner)
         */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Integer min = numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();
        int result1 = numbers.stream().reduce(0, (subtotal, element) -> subtotal + element);
//                .reduce(0, Integer::sum);
        //0 is Identity
        //(subtotal, element) -> subtotal + element or Integer::sum is the accumulator
        System.out.println(result1);

        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        String result2 = letters.stream().reduce("", (partialString, element) -> partialString.toUpperCase() + element.toUpperCase());
        System.out.println(result2);

        List<User> users = Arrays.asList(new User("John", 30), new User("Julie", 35));
        int computedAges = users.stream().reduce(0, (partialAgeResult, user) -> partialAgeResult + user.getAge(), Integer::sum);
        System.out.println("Integer::sum is combiner that resolves Accumulator types User and Integer. Result " + computedAges);
        int agesMore30 = users.stream().reduce(0, (x, y) -> {
            if (y.getAge() > 30) {
                return x + y.getAge();
            } else {
                return x;
            }
        }, Integer::sum);
        System.out.println(agesMore30);

        System.out.println("Reduce without Identity: numbers.stream().reduce((a,b) -> a*b); " + numbers.stream().reduce((a, b) -> a * b).get());

//        System.out.println(divideListElements(numbers,0));
    }

    public static int divideCountListElements(List<Integer> values, int divider) {
        return values.stream().reduce(0, (a, b) -> {
            try {
                return a / divider + b / divider;
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
            return 0;
        });
    }
    public static void divideListElements(List<Integer> values, Integer divider) {

//        try{
//            values.stream().map(a -> a/divider).forEach(System.out::println);
//        }catch (ArithmeticException e){
//            e.printStackTrace();
//        }finally {
//            System.out.println("Couldn't devide by : " + divider);
//        }

        values.stream().map(a -> {
            try {
                return a / divider;
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
                return 0;
        }).forEach(System.out::println);
    }
}


class User {

    String name;
    int age;

    User(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}