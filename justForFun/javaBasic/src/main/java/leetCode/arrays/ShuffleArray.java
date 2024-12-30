package leetCode.arrays;

import java.util.Random;

public class ShuffleArray {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        int[] randomize = randomize(arr);

        for(int s: randomize){
            System.out.println(s);
        }
    }

    private static int[] randomize(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomIndexToSwap = random.nextInt(array.length);
            int temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = temp;
        }
        return array;
    }

}
