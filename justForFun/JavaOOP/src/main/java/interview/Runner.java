package interview;

public class Runner {
    public static void main(String[] args) {
//        getBiggestPolindrtom();

//        System.out.println(isPolindrom(353));
        Polindroms polindroms = new Polindroms();
//        System.out.println("String abb is polindrom " + polindroms.isPolindrom("abb"));
        System.out.println(polindroms.getBiggestSubstringPolindrome("ABBA"));
    }


    public static void getBiggestPolindrtom() {
        int polindrom = 0;
        for (int i = 10; i <= 100; i++) {
            for (int j = 10; j <= 100; j++) {
                if (isPolindrom(i * j) && polindrom < i * j) {
                    polindrom = i * j;
                }
            }
        }
        System.out.println(polindrom);
    }


    public static boolean isPolindrom(int num) {
        int r, reversedNum = 0, temp;
        temp = num;
        while (num > 0) {
            r = num % 10;
            System.out.println(r);
            reversedNum = (reversedNum * 10) + r;
            System.out.println(reversedNum);
            num = num / 10;
            System.out.println(num);
        }
        if (temp == reversedNum) {
            return true;
        } else return false;
    }
}

