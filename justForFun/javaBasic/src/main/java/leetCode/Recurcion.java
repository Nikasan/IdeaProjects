package leetCode;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.LongStream;

public class Recurcion {

    public static void main(String[] args) {

    }

    public static int fibonachiRecursion(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonachiRecursion(n - 1) + fibonachiRecursion(n - 2);
        }
    }

    public static void printFibonachiSerie(int n) {
        Consumer<Integer> consumer = System.out::println;
        for (int i = 0; i <= n; i++) {
//            System.out.println(fibonachiRecursion(i));
            consumer.accept(fibonachiRecursion(i));
        }
    }


    private static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

//factorial using recursion
    private static long fastFactorial(int n) {
        if (n <= 2) {
            return n;
        } else {
            return n * fastFactorial(n - 1);
        }
    }

    //factorial using stream api
    private static long streamFactorial(int n){
        return LongStream.range(1,n).reduce(1, (long x, long y) -> x*y);
    }
}