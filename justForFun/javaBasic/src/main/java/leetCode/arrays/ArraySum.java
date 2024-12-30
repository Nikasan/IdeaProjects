package leetCode.arrays;

public class ArraySum {

    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 4};
        System.out.println(sum(arr));
        System.out.println(_sum(arr, 0));
        System.out.println(_sum(arr, 2));
    }

    public static int sum(int[] arr) {
        return _sum(arr, 0);
    }

    //helper method
    public static int _sum(int[] arr, int start) {
        if (arr.length == start) {
            return 0;
        }
        return arr[start] + _sum(arr, start + 1);
    }

}
