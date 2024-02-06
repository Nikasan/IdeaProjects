package Comparings;

public class TernaryOperator {

    public static void main(String[] args) {
        int a = 3;
        int b = 20;
        int max = (a > b) ? a : b;
        System.out.println(max);
        System.out.println();
        System.out.println(a > 2 ? a % 2 != 0 ? 3 : 6 : 9);
    }
}
