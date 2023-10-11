package leetCode.arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicatesFromSortedArray_28 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(getNumberOfUniqueElements(arr));
    }

    public static int getNumberOfUniqueElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        nums = set.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(nums));
        return set.size();
    }

    public static int removeDuplicates(int[] nums) {
        int l = 1;
        for (int r = 1; r < nums.length - 1; r++) {
            if (nums[r] != nums[r - 1]) {
                nums[l] = nums[r];
                l++;
            }
        }
        return l;
    }

}
