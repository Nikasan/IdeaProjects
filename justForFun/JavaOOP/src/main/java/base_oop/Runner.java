package base_oop;

/**
 * Created by Nikasan
 */
public class Runner {

    public static void main(String[] args) throws CloneNotSupportedException {

//        AbstractClassA a = new AbstractClassA(); can't be instantiated

        Student student = new Student();
        student.setAge(22);
        Student clone = (Student) student.clone();
        System.out.println(student.hashCode());
        System.out.println(student.getAge());
        System.out.println(clone.hashCode());
        System.out.println(clone.getAge());
    }

}
