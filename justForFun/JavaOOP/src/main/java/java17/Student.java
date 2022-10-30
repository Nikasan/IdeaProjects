package java17;

/**
 * Created by Nikasan
 */
public class Student implements Cloneable {

    Student(int age){
        this.age = age;
    }
    Student(){}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
