package udemy_java_basic_course.access_modifiers.cats;

public class Cat {
    protected int age;
    int weight;

    public String name;
    private String type;

   protected Cat(){}

    Cat(int weight) {
        this.weight = weight;
    }

    private Cat(String type) {
        this.type = type;
    }

    protected Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
