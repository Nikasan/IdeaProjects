package Generics;

class GenericClass<T1, T2> {
    T1 obj1;
    T2 obj2;

    GenericClass(T1 obj1, T2 obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void runTest(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
}