import java.util.stream.IntStream;

/**
 * Created by Nikasan
 */
public class CodeTasks {

    public static void main(String[] args) {

//        System.out.println(ifPalindrome2("Abc fBa"));
//        fibbonachi(10);

        int[] a = {2,5,7};
        int max = getMax(a);
        System.out.println(max);
    }

    static boolean ifPalindrome(String s) {
        String temp = s.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, temp.length() / 2).noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
    }

    static boolean ifPalindrome2(String s) {
        String clean = s.replaceAll("\\s+", "").toLowerCase();
        StringBuilder plain = new StringBuilder(clean);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(clean);
    }

    public boolean isPolindrom(int num) {
        int r, temp, revercedNum = 0;
        temp = num;
        while (num > 0) {
            r = num % 10;
            num = revercedNum * 10 + r;
            num = num / 10;
        }
        return temp == revercedNum;
    }

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static int factorial(int a) {
        int f = 1;
        if (a == 1) {
            return f;
        } else {
            for (int i = 1; i < a; i++) {
                f = f * i;
            }
        }
        return f;
    }

    //каждое следующее число равно сумме двух предыдущих
    public static void fibbonachi(int a){
        int pre = 0;
        int now =1;
        int next = 0;
        System.out.println(pre);
        while (next<=a){
            System.out.println(now);
            next = pre+now;
            pre =now;
            now = next;
        }
    }

    public static int getMax(int[] a){
        int max = a[0];
        for(int i =0; i<a.length; i++){
            if(max<a[i]){
                max = a[i];
            }
        }
        return max;
    }
}
