package leetCode;

public class StringsTasks {
    public static void main(String[] args) {
        String str = "mama mila milu";

        System.out.println(reverseString(str));
        System.out.println(isPolindrom("opal"));
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
        if (str == s) return true;
        else return false;
    }

}