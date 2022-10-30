package SOLID.DependencyInversion;

interface MusicApi {

    void getTracks();
}

class YandexMusic implements MusicApi {

    @Override
    public void getTracks() {
    }
}

class SpotyFy implements MusicApi {

    @Override
    public void getTracks() {
    }
}

//прослойка между интерфесами
class Client implements MusicApi {

    MusicApi api;

    Client(MusicApi api) {
        this.api = api;
    }
//делегируем вызов метода соответствующему апи
   public void getTracks(){
        this.api.getTracks();
    }
}

/**
 * Created by Nikasan
 */
//The principle states that we must use abstraction (abstract classes and interfaces) instead of concrete implementations.
//High-level modules should not depend on the low-level module but both should depend on the abstraction.
// Because the abstraction does not depend on detail but the detail depends on abstraction.
public class Example {

    public static void main(String[] args) {
        MusicApi api = new Client(new SpotyFy());
        api.getTracks();
    }
}
