package base_oop;

/**
 * Created by Nikasan
 */
public interface IAnimal {

    String i = "hello!";

    void bark();

    default String getInterfaceName(){
       makeOneMoreTime();
        return "IAnimal";
    }

    private void makeSmth(){
        System.out.println("Do" +i);
    }

    private void makeOneMoreTime(){
        makeSmth();
    }

    private static void staticMethod(){

    }
}
