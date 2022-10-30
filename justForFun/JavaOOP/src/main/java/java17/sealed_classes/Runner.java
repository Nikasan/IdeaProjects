package java17.sealed_classes;

/**
 * Created by Nikasan
 */

//https://mydeveloperplanet.com/2021/09/28/whats-new-between-java-11-and-java-17/
public class Runner {



    VegetableBaseSailed cucumber = new CucumberNonSailed();
    VegetableBaseSailed tomato = new TomatoFinal();
//  The super class cannot control whether a subclass may be extended and how it may be extended.
    VegetableBaseSailed pickle = new Pickle();
}

//We need to allowed in base class which classes can be extended
abstract sealed class VegetableBaseSailed permits CucumberNonSailed, TomatoFinal{}

//The subclasses need to indicate whether they are final, sealed or non-sealed.
non-sealed class CucumberNonSailed extends VegetableBaseSailed{}
final class TomatoFinal extends VegetableBaseSailed{}
class Pickle extends CucumberNonSailed {}

//class Cherry extends TomatoFinal{}