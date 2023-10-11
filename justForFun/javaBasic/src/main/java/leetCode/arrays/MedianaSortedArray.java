package leetCode.arrays;

//Медиана отсортированного массива размера N определяется как средний элемент, когда N нечетное,
// и среднее значение двух средних элементов, когда N четное.
public class MedianaSortedArray {

    public static void main(String[] args) {
        int [] even = {1,3,5,6};
        System.out.println(mediana(even));

        int [] odd = {1,3,5,6,8};
        System.out.println(mediana(odd));
    }

    public static int mediana(int[] arr){
       int length = arr.length;
        if(length%2==1){
            return arr[(length+1)/2 -1];
        }else {
            return (arr[length/2-1] + arr[length/2])/2;
        }

    }
}
