package leetCode.arrays;

public class Search_Insert_Position_35 {

    public static void main(String[] args) {
        int [] arr1 = {8};
        System.out.println(solution(arr1, 7));
    }

   /* Given a sorted array of distinct integers and a target value,
            return the index if the target is found.
    If not, return the index where it would be if it were inserted in order.
    */

    private static int solution(int [] arr, int target){
        int position = 0;
        if (target >= arr[arr.length - 1]) position = arr.length;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                position = i;
            }else{
                if(target > arr[i]){
                    position = i+1;
                }
            }
        }
        return position;
    }
}
