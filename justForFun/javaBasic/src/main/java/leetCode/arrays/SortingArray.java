package leetCode.arrays;

import java.util.Arrays;

public class SortingArray {

    public static void main(String[] args) {
        int[] arr = {2, 5, 1};
        System.out.println(getMin(arr));
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }


        public static int[] bubbleSort(int[] arr) {
            int n = arr.length;
            int temp = 0;
            for (int i = 0; i < n; i++) { //проходим по всему массиву
                for (int j = 1; j < (n - i); j++) { // проходим по массиву без последних i элементов
                    if (arr[j - 1] > arr[j]) { //сравниваем 2ой и 1ый, 3 & 2, change them if 1th>2nd
                        //swap elements
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }

                }
            }
            return arr;
        }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}
