package udemy_java_basic_course.string;

public class StringBasics {
//String immutable - we can't change ones created in memory
     String str1 = "Good";
     String str2 = new String("Good");

    public static void main(String[] args) {
        String str2 = new String("Good"); //create object despite that it exists in String pool
        String str1 = "Good";
        String str3 = "Good";
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println("str1==str2 ? :"); System.out.println(str1==str2);
        System.out.println("---------------------------------------");
        System.out.println("str1==str3 ? :"); System.out.println(str1==str3);

        System.out.println("str1.equals(str2) ? " + str1.equals(str2));
    }
}
