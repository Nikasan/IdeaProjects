package leetCode;

import java.util.Arrays;
import java.util.function.Consumer;

public class Recurcion {

    public static void main(String[] args) {
        int[] arr = {0, 1,2,3};
        System.out.println(_arraySum(arr,4));
    }

    public static int fibonachiRecursion(int n) {
        if (n < 2) return n;
        else return fibonachiRecursion(n - 1) + fibonachiRecursion(n - 2);
    }

    public static void printFibonachiSerie(int n) {
        Consumer<Integer> consumer = System.out::println;
        for (int i = 0; i <= n; i++) {
//            System.out.println(fibonachiRecursion(i));
            consumer.accept(fibonachiRecursion(i));
        }
    }

    //array sum of elements
    public static int arraySum(int[] arr) {
        //slow solution
//        if (arr.length == 0) return 0;
//        int[] rest = Arrays.copyOfRange(arr, 1, arr.length);
//       return arr[0] + arraySum(rest);
        return _arraySum(arr, 0);
    }

    //fast solution
    private static int _arraySum(int[] arr, int start) {
        if (start == arr.length) return 0; // start bigger than array length
        return arr[start] + _arraySum(arr, start + 1);
    }
}
