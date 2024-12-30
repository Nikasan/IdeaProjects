package leetCode.strings;

public class LongestCommonPrefix_14 {

    // Input: strs = ["flower","flow","flight"]
    //Output: "fl"
    public static void main(String[] args) {
        String[] arr = {"flower", "cat", "flight"};
        System.out.println(commonPrefix(arr));
    }

    private static String commonPrefix(String[] arr) {
        if(arr==null || arr.length==0) return "";

        StringBuilder prefix = new StringBuilder();

        int minLenght = arr[0].length();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() < minLenght) {
                minLenght = arr[i].length();
            }
        }

        for (int i = 0; i < minLenght; i++) {
            char current = arr[0].charAt(i);
            // Check if this character is found in all other strings or not
            for (String str : arr) {
                if (str.charAt(i) != current) {
                    return prefix.toString();
                }
            }
            prefix.append(current);
        }
        return prefix.toString();
    }

}
