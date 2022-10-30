package SOLID.OpenClosedPrinciple.bad;

/**
 * Created by Nikasan
 */

//при малейшем изменении приходиться вносить изменения во все места использования
    //надо думать о расширяемости кода!
public class BadExample {

    public static void main(String[] args) {
        Celica celica = new Celica();
        taxi(celica);
    }

    //осторожно! Говнокод:
    static void taxi(Toyota toyota){
        if(toyota instanceof Celica){
            toyota.getPasanger();
        }else {
            toyota.getPasangers();
        }
    }
}

class Toyota{
    void getPasangers(){
        System.out.println("Get pasangers");
    }

    void getPasanger(){
        System.out.println("Get 1 pasanger");
    }
}

class Celica extends Toyota{}