package leetCode.arrays;

public class SecondBiggestNumber {

    public static int getSecondBiggerNumber(int[] arr) {
        int max = arr[0];
        int preMax = 0;

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            if (current > max) {
                preMax = max;
                max = current;
            } else if (current > preMax) {
                preMax = current;
            }
        }
        return preMax;
    }

}
