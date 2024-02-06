package base_oop.classes;

public interface InterfaceA {

    int a = 5;

    void printSmt() ;


    default void addMethod() {
        System.out.println("Default:");
    }

    static int staticMethod(){
        return a*2;
    }
}
