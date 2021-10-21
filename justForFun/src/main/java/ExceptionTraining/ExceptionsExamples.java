package ExceptionTraining;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsExamples {

    public void division (int a, int b){
        System.out.println(a/b);
    }

    public void printFromFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        FileInputStream stream = new FileInputStream(file);
        //checked should be sorrowed with try catch or add in method signature
        System.out.println("File not found");
    }

    public static void main(String[] args){
        ExceptionsExamples examples = new ExceptionsExamples();
       //unchecked
//        examples.division(5,0);

        //checked should be sorrowed with try catch or add in method signature
//        try {
//            examples.printFromFile("no such path");
//        } catch (FileNotFoundException e) {
//            System.out.println();
//            e.printStackTrace();
//            System.out.println("text not from file");
//        }

        try{
            String str = null;
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I am finally block!");
        }


// System.exit(0); if add it to catch block finally will not execute


      /* The classes that directly inherit the Exception (includes) class except RuntimeException - checked
        Checked exceptions need to be declared in a method or constructor's throws clause
        RuntimeException and its subclasses are unchecked exceptions.
        Unchecked exceptions do not need to be declared in a method or constructor's throws clause
        they are checked at runtime.*/
        // if they can be thrown by the execution of the method or constructor and propagate outside the method or constructor boundary.
        try{

        }catch (Exception e){

        }

    }
}
