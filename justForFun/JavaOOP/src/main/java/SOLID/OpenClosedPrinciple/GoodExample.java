package SOLID.OpenClosedPrinciple;

/**
 * Created by Nikasan
 */
//software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification
public class GoodExample {

    public static void main(String[] args) {
        Celica celica = new Celica();
        workInTaxi(celica);
    }

    public static void workInTaxi(Car car){
         car.taxi();
    }
}

interface Car{
    void taxi();
}

class Toyota implements Car{

    @Override
    public void taxi() {
        System.out.println("I can get 3 passenger");
    }
}

class Celica extends Toyota{

    @Override
    public void taxi(){
        System.out.println("I can get 1 passenger");
    }
}