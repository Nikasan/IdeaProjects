package Generics;

public class GenericMethod {
    public <T> void testMethod(T t){
        System.out.println(t.getClass().toGenericString() + t.toString());
    }
}
