package CollectionsTraining;

import java.util.*;
import java.util.stream.Stream;

public class CollectionsExamples {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("1", "2", "3", "4", "5"));

        arrayList.stream().peek(s -> s.toLowerCase());
        CollectionsExamples c = new CollectionsExamples();
        c.iteration1(arrayList);

        LinkedList<String> linkedList = new LinkedList<String>(Arrays.asList("66", "1", "2", "3", "4", "5"));
        System.out.println("I am LinkedList: ");
        c.iteration2(linkedList);
        HashSet<String> set = new HashSet();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        c.iteration3(set);
        System.out.println("I am HashSet: ");
        Stream<String> peek = set.stream().peek(System.out::println);

        Map<String, String> map = new HashMap<>();
        map.put("1", "10");
        map.put("2", "20");
        map.put("3", "30");
        map.put("4", "30");
        map.put("5", null);
        map.put("6", null);
        c.iteration4(map.values());
        System.out.println("I am HashMap: ");
        System.out.println(map);

        Map<String, String> tremap = new TreeMap<>(); // sorting by key
        tremap.put("22", "2");
        tremap.put("44", "4");
        tremap.put("1", "7");
        tremap.put("2", "1");
        System.out.println("I am TreeMap: ");
        System.out.println(tremap);
    }

    //Цикл с итератором и while loop
    public <T> void  iteration1(Collection <T> t){
        Iterator<T> iterator = t.iterator();
        System.out.println("I am from Iterator:");
        while (iterator.hasNext()) {
            System.out.println("value= " + iterator.next());
        }
    }

    //обычный цикл for
    public  <T> void  iteration2(Collection<T> t){
        System.out.println("I am from for loop:");
        for (int i=0; i < t.size(); i++) {
            System.out.println("value= " + t.toArray()[i]);
        }
    }

    //расширенный цикл for
    public <T> void  iteration3(Collection <T> t){
        System.out.println("I am from extended for loop:");
        for (T s : t) {
            System.out.println("value= " + s);
        }
    }

    //с foreach
    public  <T> void  iteration4(Collection<T> t){
        System.out.println("I am from foreach:");
        t.forEach(System.out::println);
        t.forEach(n -> { System.out.println(n +"abc");
            System.out.println("one more action");
        });
    }
}
