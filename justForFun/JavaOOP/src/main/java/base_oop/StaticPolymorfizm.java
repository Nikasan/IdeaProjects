package base_oop;

/**
 * Created by Nikasan
 */
//Method overloading is an example of compile time polymorphism.
//Method Overloading: This allows us to have more than one method having the same name,
// if the parameters of methods are different in number, sequence and data types of parameters.
public class StaticPolymorfizm {

    public static void main(String[] args) {
        Child base = new Child();
        base.print(5);
    }


}

class Base {
/*    Different Ways of Method Overloading in Java:
    Changing the Number of Parameters.
    Changing Data Types of the Arguments.
    Changing the Order of the Parameters of Methods
 */
    public void print(String a) {
        System.out.println(a);
    }

   public void print(String a, Integer b) {
        System.out.println(a + b);
    }

    public void print(Integer a, String b) {
        System.out.println(a + b);
    }

   public String print(String a, int b) {
        return (a+b);
    }

    public int sum(int x, int y) { return (x + y); }

    // Overloaded sum(). This sum takes three int parameters
    public int sum(int x, int y, int z)
    {
        return (x + y + z);
    }

    // Overloaded sum(). This sum takes two double
    // parameters
    public double sum(double x, double y)
    {return (x + y);}
}

class Child extends Base {

    void print(int a) {
        System.out.println(a * a + "child");
    }
}