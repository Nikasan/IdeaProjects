package java17;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * Created by Nikasan
 */
public class Features {

    public static void main(String[] args) {
        String str = """
                {
                Name: Veronika
                Age: 32
                }
                """;
        System.out.println(str);

        oldStyleWithYield(Fruit.LEMON);
        withReturnValueEvenShorter(Fruit.PEAR);

        /*
        the same as class with getters, setters, all methods overriding
        Records will allow you to create immutable data classes.
        * https://www.baeldung.com/java-record-keyword
        * https://www.baeldung.com/java-immutable-object
        */
        record StudentRecord(int age){}
        StudentRecord st1 = new StudentRecord(22);
        StudentRecord st2 = new StudentRecord(22);
        System.out.println(st1.equals(st2)); //true
        System.out.println(st1);

        //toList() in stream API
        List<String> list = new ArrayList<>(Arrays.asList("1","2","3"));
        List<String> strings = list.stream().filter((a) -> (Objects.equals(a, "1") || Objects.equals(a, "2"))).toList();
        System.out.println(strings);

        /*
        Helpfull NPE
         */
        HashMap<String,StudentRecord> map = new HashMap<>();
        map.put("1",new StudentRecord(22));
        map.put("2",null);
        //Cannot invoke "java17.Features$1StudentRecord.age()"
        // because the return value of "java.util.HashMap.get(Object)" is null
        //at java17.Features.main(Features.java:41)
        System.out.println(map.get("2").age());
        //before java 17 we should do debagging to find method with NPE




    }
    private static void oldStyleWithYield(Fruit fruit) {
        System.out.println(switch (fruit) {
            case APPLE, PEAR:
                yield "Common fruit";
            case LEMON, BANANA:
                yield "Exotic fruit";
            default:
                yield "Undefined fruit";
        });
    }

    private static void withReturnValueEvenShorter(Fruit fruit) {
        System.out.println(
                switch (fruit) {
                    case APPLE, PEAR -> "Common fruit";
                    case LEMON, BANANA -> "Exotic fruit";
                    default -> "Undefined fruit";
                });
    }


}
