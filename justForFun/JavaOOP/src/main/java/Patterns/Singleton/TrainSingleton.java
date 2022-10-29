package Patterns.Singleton;

public class TrainSingleton {
    private static TrainSingleton instance;
    private TrainSingleton(){}

    public static TrainSingleton getStaticInstance(){
        if(instance == null)
            instance = new TrainSingleton();
        return instance;
    }

    public TrainSingleton getInstance(){
        if(instance == null)
            instance = new TrainSingleton();
        return instance;
    }

}
