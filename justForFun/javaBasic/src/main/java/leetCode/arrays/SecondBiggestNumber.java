package leetCode.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SecondBiggestNumber {

    public static int getSecondBiggerNumber(int[] arr) {
        int first, second;
        first = second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (current > first) {
                second = first;
                first = current;
            } else if (current > second && current != first) {
                second = current;
            }
        }
        return second;
    }

    public static int getSecondBiggerNumber2(int[] arr) {
        Arrays.sort(arr);
        int result = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < arr[arr.length - 1]) {
                result = arr[i];
                break;
            }
        }
        return result;
    }

    public static void findNbiggestNumber(int[] arr, int n) {
        int[] result = new int[n];
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for(int i = 0; i < n; i++){
            result[i]= set.last();
            set.remove(set.last());
        }
     Arrays.stream(result).forEach(System.out::println);
    }

    public static void findNbiggestNumber2(Integer [] arr, int n) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        HashSet<Integer> set = new HashSet<>();
        set.addAll(List.of(arr));
        for (int i = 0; i < set.size(); i++) {
            queue.add(arr[i]);
            if (queue.size() > n) {
                queue.poll();
            }
        }

        while (!queue.isEmpty()) {
            System.out.print(queue.peek() + " ");
            queue.poll();
            System.out.println(queue);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {2, 1, 3, 3, 1, 1};
//        System.out.println(getSecondBiggerNumber(arr));
//        System.out.println(getSecondBiggerNumber2(arr));
//        findNbiggestNumber(arr, 2);

        findNbiggestNumber2(arr, 2);
    }
}

