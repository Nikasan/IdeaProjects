package leetCode.arrays;

import java.util.*;

public class FindDistinktPairs {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        ArrayList<int[]> distinktPairs = getDistinktPairs(nums);
        distinktPairs.stream().map(Arrays::toString).forEach(System.out::println);

    }

    public static ArrayList<int[]> getDistinktPairs(int[] arr) {

        int length = arr.length;
        ArrayList<int[]> result = new ArrayList<>();
        Set<int[]> result_ = new HashSet<>();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int[] nums = {i, j};
                result_.add(nums);
            }
        }
        result.addAll(result_);
        return result;
    }
}
