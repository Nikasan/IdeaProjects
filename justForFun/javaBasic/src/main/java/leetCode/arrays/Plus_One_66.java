package leetCode.arrays;

import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;

public class Plus_One_66 {

    public static void main(String[] args) {
        int[] digits = {9,9,9};
        int[] result = method(digits);
//        for (int s : result) {
//            System.out.println(s);
//        }
    }

    private static int[] method(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                ++digits[i];
//                System.out.println(digits[i]);
                return digits;
            }
            digits[i] = 0;
        }

//        for (int s : digits) {
//            System.out.println(s);
//        }

        int[] ans = new int[digits.length + 1];
        ans[0] = 1;

        for (int s : ans) {
            System.out.println(s);
        }
        return ans;
    }

}
