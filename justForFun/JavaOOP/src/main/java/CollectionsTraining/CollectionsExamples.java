package CollectionsTraining;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionsExamples {
    // Interface List - ordered collection of objects. It can have duplicate values

    ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5",null));
//    LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("66", "1", "2", "3", "4", "5"));
//    //Vector is synchronized.
//    //Java Vector contains many legacy methods that are not the part of a collections framework.
//    Vector<String> vector = new Vector<>();

    String[] arr = {"f", null, "h"};
    Predicate<String> predicate = str -> str.startsWith("o") && str.startsWith("O");

    //last-in-first-out data structure
    public <T> Stack<T> fillStack(T... t) {
        Stack stack = new Stack<>();
        for (T c : t) {
            stack.add(c);
        }
        return stack;
    }

    public <T> Set<T> getCollectionWithoutDuplicates(Collection<T> collection) {
        HashSet<T> ts = new HashSet<>();
        ts.addAll(collection);
        return ts;
    }


    //Цикл с итератором и while loop
    public <T> void iteration1(Collection<T> t) {
        Iterator<T> iterator = t.iterator();
        System.out.println("I am from Iterator:");
        while (iterator.hasNext()) {
            System.out.println("value= " + iterator.next());
        }
    }

    //Цикл с итератором и forechRemaing

    public <T> void iteration5(Collection<T> t){
        Iterator<T> iterator = t.iterator();
        iterator.forEachRemaining((e) -> {
            System.out.println(e);
            System.out.println(e + "bla");
        });
    }

    //обычный цикл for
    public <T> void iteration2(Collection<T> t) {
        System.out.println("I am from for loop:");
        for (int i = 0; i < t.size(); i++) {
            System.out.println("value= " + t.toArray()[i]);
        }
    }

    //расширенный цикл for
    public <T> void iteration3(Collection<T> t) {
        System.out.println("I am from extended for loop:");
        for (T s : t) {
            System.out.println("value= " + s);
        }
    }

    //с foreach
    public <T> void iteration4(Collection<T> t) {
        System.out.println("I am from foreach:");
        t.forEach(System.out::println);
        t.forEach(n -> {
            System.out.println(n + "abc");
            System.out.println("one more action");
        });
    }

    public int arraySum(int[] a) {
        int result = 0;

        //usual for
//        for (int c : a) {
//            result = result + c;
//        }
        //faster because of minus 1 iteration
//        int result = a[0];
//        for (int i = 1; i < a.length; i++) {
//            result = result + a[i];
//        }

//       result = Arrays.stream(a).sum();

        result = Arrays.stream(a).reduce(0, Integer::sum);
        return result;
    }

    //does array contain particular number?
    public boolean containsNumber(int[] a, int n) {
        boolean result = false;
//        for (int c : a) {
//            if (c == n) {
//                result = true;
//                break;
//            }
//        }

        result = Arrays.stream(a).anyMatch(c -> c == n);
        return result;
    }

    //revert elements in collection = first will be last
    public <T> List<T> revertCollectionElements(List<T> t) {
        Collections.reverse(t);
        return t;
    }

    //sort map by key
    public <K extends Comparable<? super K>,V> Map<K,V> sortMapByKey(Map<K, V> map){
//       return new TreeMap<>(map);

        return map.entrySet().stream()
                .sorted(Map.Entry.<K,V>comparingByKey().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

//        return map.entrySet().stream()
//                .sorted(Map.Entry.<K,V>comparingByKey())
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

    //sort map by value
    public <K ,V extends Comparable <? super V>> Map<K,V> sortMapByValue(Map<K, V> map){
        return map.entrySet().stream()
                .sorted(Map.Entry.<K, V>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

}
