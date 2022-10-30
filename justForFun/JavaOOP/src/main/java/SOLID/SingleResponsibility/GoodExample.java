package SOLID.SingleResponsibility;

/**
 * Created by Nikasan
 */
//"A class should have only one reason to change"

public class GoodExample {

    public static void main(String[] args) {
        EmployeeFacade employee = new EmployeeFacade();
        employee.cook();
    }

}

class EmployeeFacade {

    public Cook cook = new Cook();
    public Clean clean = new Clean();

    void cook() {
        cook.cook();
    }

    void clean() {
        clean.clean();
    }
}

class Cook {

    void cook() {
    }

}

class Clean {

    void clean() {
    }

}