package leetCode.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveElement_27 {
    public static void main(String[] args) {
        int [] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums,2));
    }

    //перемещает все элементы массива не равные val в начало
    public static int removeElement(int[] nums, int val){
        int k=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[k]=nums[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
       return k;
    }
}
