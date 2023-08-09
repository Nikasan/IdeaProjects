package Comparings;

public class ComparingStrings {
   /*
    == is a reference comparison, i.e. both objects point to the same memory location
    equals() evaluates to the comparison of values in the objects
*/
    static String st1 = "Abc";
    static String st2 = "Abc";

    static String st3 = new String("Abc");
    static String st4 = new String("Abc");

    public static void main(String[] args) {
        System.out.println("st1==st2: " + (st1 == st2));
        System.out.println("st1.equals(st2): " + st1.equals(st2));

        System.out.println("st3==st4: " + (st3 == st4));
        System.out.println("st3.equals(st4): " + st3.equals(st4));

    }
}
