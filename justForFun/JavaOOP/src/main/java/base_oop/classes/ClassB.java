package base_oop.classes;

public class ClassB implements InterfaceA{

    @Override
    public void printSmt() {
        System.out.println("ClassB implements InterfaceA");
    }

    @Override
    public void addMethod() {
        InterfaceA.super.addMethod();
        System.out.println("Overriden default method in classB");
    }
}
