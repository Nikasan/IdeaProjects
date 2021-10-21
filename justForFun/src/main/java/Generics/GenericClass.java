package Generics;

class GenericClass<T, U> {
    T obj1;
    U obj2;

    GenericClass(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void runTest(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
}