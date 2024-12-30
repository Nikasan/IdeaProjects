import java.util.ArrayList;
import java.util.HashMap;

public class Test {

    public static void main(String[] args) {


        System.out.println(10 / 0);
        try {

                System.out.println("try");
            } catch (Exception e) {
                System.out.println("catch");
            } finally {
                System.out.println("finally");
            }

        }
    }
