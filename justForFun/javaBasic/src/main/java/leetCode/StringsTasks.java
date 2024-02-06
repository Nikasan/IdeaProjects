package leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class StringsTasks {

    public static void main(String[] args) {

        System.out.println(isStringsIdentical("aa", "aa"));
//        System.out.println(isStringsIdentical2("Prada", "dRaap"));
//
//        String str = "mama mila milu";
//
//        System.out.println(reverseString(str));
//        System.out.println(isPolindrom("opal"));
    }

    public static String reverseString(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            builder.append(str.charAt(i));
        }
        return builder.toString();
    }

    public static boolean isPolindrom(String str) {
        System.out.println("Original String: " + str);

        String s = reverseString(str);
        if (str == s) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isStringsIdentical(String s, String r) {
        if (s.length() != r.length()) {
            return false;
        }
        s = s.toLowerCase();
        r = r.toLowerCase();
        HashMap<String, Integer> sm = new HashMap<>();
        HashMap<String, Integer> rm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (sm.containsKey(String.valueOf(s.charAt(i)))) {
                int i1 = sm.get(String.valueOf(s.charAt(i))) + 1;
                sm.put(String.valueOf(s.charAt(i)), i1);
            } else {
                sm.put(String.valueOf(s.charAt(i)), 1);
            }
        }

        for (int i = 0; i < r.length(); i++) {
            if (rm.containsKey(String.valueOf(r.charAt(i)))) {
                int i1 = rm.get(String.valueOf(r.charAt(i))) + 1;
                rm.put(String.valueOf(r.charAt(i)), i1);
            } else {
                rm.put(String.valueOf(r.charAt(i)), 1);
            }
        }
        return sm.equals(rm);
    }

    public static boolean isStringsIdentical2(String s, String r) {
        if(s.length()!=r.length()) return false;
        s = s.toLowerCase();
        r = r.toLowerCase();

        char[] charArray1 = s.toCharArray();
        char[] charArray2 = r.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1,charArray2);

    }

}