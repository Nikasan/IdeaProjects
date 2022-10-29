package ExceptionTraining;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsExamples {

    public static void main(String[] args) {
        ExceptionsExamples examples = new ExceptionsExamples();

        try {
            examples.badMethod();
            System.out.println("try block");
        } catch (Exception e) {
            System.out.println("exeption");
        }finally {
            System.out.println("finaly block");
        }
        System.out.println("finish");
        //unchecked
//        examples.division(5, 0);
//        examples.printFromFile("jhjh");

        //checked should be sorrowed with try catch or add in method signature
//        try {
//            examples.printFromFile("no such path");
//        } catch (FileNotFoundException e) {
//            System.out.println();
//            e.printStackTrace();
//            System.out.println("text not from file");
//        }

        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I am finally block!");
        }

// System.exit(0); if add it to catch block finally will not execute


      /* The classes that directly inherit the Exception (includes) class except RuntimeException - checked
        Checked exceptions need to be declared in a method or constructor's throws clause
        RuntimeException and its subclasses are unchecked exceptions.
        Unchecked exceptions do not need to be declared in a method or constructor's throws clause
        they are checked at runtime.*/
        // if they can be thrown by the execution of the method or constructor and propagate outside the method or constructor boundary.


        try {
            int[] a = new int[5];
//            a[5] = 30 / 0;
//            a[6] = 8;
            throw new Exception();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }

    public void division(int a, int b) {
        System.out.println(a / b);
    }

    public void printFromFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        FileInputStream stream = new FileInputStream(file);
        //checked should be sorrowed with try catch or add in method signature
        System.out.println("File not found");
    }

    public void test() throws Exception {
        try {
            throw new Exception();
        } finally {
            System.out.println("finally");
        }
    }

    public void badMethod(){
        throw new Error();
    }
}
