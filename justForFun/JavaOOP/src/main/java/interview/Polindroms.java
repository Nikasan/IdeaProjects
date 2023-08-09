package interview;

import java.util.stream.IntStream;

public class Polindroms {

    public boolean isPolindrom(String str) {
        StringBuilder builder = new StringBuilder();
        builder.append(str);
        StringBuilder reverse = builder.reverse();
        String reverseString = reverse.toString();
        return str.equals(reverseString);
    }

    static boolean ifPalindrome(String s) {
        String temp = s.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, temp.length() / 2).noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
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

    public String getBiggestSubstringPolindrome(String s) {
        String maxPolindrom = s.substring(0, 1);
        for (int i = 0; i <= s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                if (isPolindrom(substring) && substring.length()>maxPolindrom.length()) {
                    maxPolindrom = s.substring(i, j);
                }
            }
        }
        return maxPolindrom;
    }
}
