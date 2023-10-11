package udemy_java_basic_course.string;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Veronika";
        System.out.println("s.charAt(0): " + s.charAt(0));
        System.out.println("s.indexOf(\"er\") " + s.indexOf("er"));
        System.out.println("s.startsWith(\"Ver\") " + s.startsWith("Ver"));
        System.out.println("s.endsWith(\"ka\")) " + s.endsWith("ka"));
        System.out.println(s.substring(4));
        String s1 = "   cAt   ";
        System.out.println("s1.trim(): " + s1.trim()); //delete spaces from start and end of string
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());

    }
}
