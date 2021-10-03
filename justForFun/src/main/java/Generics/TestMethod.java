package Generics;

public class TestMethod {
    public <T> void testMethod(T t){
        System.out.println(t.getClass().toGenericString() + t);
    }
}
