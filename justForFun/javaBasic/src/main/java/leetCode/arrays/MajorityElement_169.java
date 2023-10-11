package leetCode.arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class MajorityElement_169 {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        System.out.println(majorityElement(nums));
        System.out.println(majorityExtra(nums));
    }

    public static int majorityElement(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                count = map.get(arr[i]) + 1;
                map.put(arr[i], count);
            } else {
                map.put(arr[i], 1);
            }
            if (map.get(arr[i]) > arr.length / 2) {
                result = arr[i];
            }
        }
        return result;
    }


    public static List<Integer> majorityExtra(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        int flag=0;
        for(int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]) +1;
                if (count > arr.length /3) {
                    flag=1;
                } else
                    map.put(arr[i], count);

            }
            else
                map.put(arr[i],1);
        }
        List<Integer> values = map.values().stream().toList();
        return values;
    }
}
