package leetCode.arrays;

import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;

public class PalindromeNumber_9 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(91619));
    }

    // 9119
    public static boolean isPalindrome(int number) {
        if (number < 0 || number % 10 == 0) {
            return false;
        }
        int reverced = 0;

        while (number > reverced) {
            reverced = reverced * 10 + number % 10;
            System.out.println(reverced);
            number = number / 10;
            System.out.println(number);
        }
        return number == reverced || reverced / 10 == number;

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
}