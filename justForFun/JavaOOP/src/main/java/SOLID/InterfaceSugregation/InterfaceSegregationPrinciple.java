package SOLID.InterfaceSugregation;

import io.cucumber.java.en_old.Ac;

/**
 * Created by Nikasan
 */
//н
public class InterfaceSegregationPrinciple {

    public static void main(String[] args) {
        Actor actor = new Actor();
        actor.dance();
        actor.draw();

        Balerina balerina = new Balerina();
        balerina.dance(); // может только танцевать
        //если балерину унаследовать от IOpera, то придется имплементить метод draw(), а для балерины этот метод не нужен

    }
}

interface ISing{
    void draw();
}

interface IDance{
    void dance();
}

interface IOpera extends ISing,IDance{
}

class Balerina implements IDance{

    @Override
    public void dance() {
        System.out.println("I am Balerina, I can only dance");
    }
}

class Actor implements IOpera{

    @Override
    public void draw() {
        System.out.println("I can draw");
    }

    @Override
    public void dance() {
        System.out.println("I can dance. I am actor.");
    }
}