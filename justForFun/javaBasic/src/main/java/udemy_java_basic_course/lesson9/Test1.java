package udemy_java_basic_course.lesson9;

public class Test1 {
    int a = 1;
    static int b =2;

    public void abc(int a){
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Test1.b);
    }
}
