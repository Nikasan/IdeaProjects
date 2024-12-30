package leetCode;

import java.util.function.Consumer;
import java.util.stream.IntStream;

/**
 * Created by Nikasan
 */
public class CodeTasks {

    public static void main(String[] args) {

//        System.out.println(ifPalindrome2("Abc fBa"));
//        fibbonachi(10);

        printFibonachiSerie(10);
//        System.out.println(fibonachiRecursion(10));
//        System.out.println(fibbonachiNumber(10));
//        int[] a = {2,5,7};
//        int max = getMax(a);
//        System.out.println(max);
    }

    static boolean ifPalindrome(String s) {
        String temp = s.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, temp.length() / 2).noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
    }

    static boolean ifPalindrome2(String s) {
        String clean = s.replaceAll("\\s+", "").toLowerCase();
        StringBuilder plain = new StringBuilder(clean);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(clean);
    }



    public static void bubbleSort(int[] arr) {
        for (int i = arr.length; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static int factorial(int a) {
        int f = 1;
        if (a == 1) {
            return f;
        } else {
            for (int i = 1; i < a; i++) {
                f = f * i;
            }
        }
        return f;
    }

    //каждое следующее число равно сумме двух предыдущих
    public static void fibbonachi(int a) {
        int pre = 0;
        int now = 1;
        int next = 0;
        System.out.println(pre);
        for (int i = 2; i <= a; i++) {
            System.out.println(now);
            next = pre + now;
            pre = now;
            now = next;
        }
    }

    //return n-th Fibonachi number
    public static int fibbonachiNumber(int a) {
        int pre = 0;
        int now = 1;
        int next = 0;
        if (a == 0) {
            return 0;
        } else {
            for (int i = 2; i <= a; i++) {
                next = pre + now;
                pre = now;
                now = next;
            }
            return next;
        }
    }

    public static int fibonachiRecursion(int n) {
        if (n < 2) return n;
        else return fibonachiRecursion(n - 1) + fibonachiRecursion(n - 2);
    }

    public static void printFibonachiSerie(int n) {
        Consumer<Integer> consumer = System.out::println;
        for(int i =0; i<=n;i++) {
//            System.out.println(fibonachiRecursion(i));
            consumer.accept(fibonachiRecursion(i));
        }
    }


    public static int getMax(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }


    //find distinct pairs from an array arraylist. java
    //find repeating digits between a range of integers.

}
