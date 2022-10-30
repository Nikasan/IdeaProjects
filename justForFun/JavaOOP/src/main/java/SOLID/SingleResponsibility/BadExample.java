package SOLID.SingleResponsibility;

/**
 * Created by Nikasan
 */
public class BadExample {

    public static void main(String[] args) {
        Employee cooker = new Employee(); cooker.clean();
        Employee cleaner = new Employee(); cleaner.cook();
    }
}

//more than one cause of changes
class Employee{
    void cook(){}
    void clean(){}
}
