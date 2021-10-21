package Patterns.Singleton;

public class Runner {

    public static void main(String[] args) {
        TrainSingleton dd = TrainSingleton.getStaticInstance();
        TrainSingleton zz = TrainSingleton.getStaticInstance();
        System.out.println("dd hashCode: " + dd.hashCode());
        System.out.println("zz hashCode: " + zz.hashCode());
        System.out.println(dd.equals(zz));

        TrainSingleton instance1 = dd.getInstance();
        TrainSingleton instance2 = zz.getInstance();
        System.out.println("instance1 hashCode:" + instance1.hashCode());
        System.out.println("instance2 hashCode:" + instance2.hashCode());
    }
}
