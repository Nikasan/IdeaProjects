package CollectionsTraining;

import io.cucumber.java.sl.In;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Trees {

    public static void main(String[] args) {

        exampleTreeSet();
//
//        exampleTreeMap();
        exampleSortedMap();
    }

    //sorted collection
    public static void exampleTreeSet(){
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(2);
        treeSet.add(7);
        treeSet.add(1);
        treeSet.add(102);
        System.out.println("TreeSet:");
        System.out.println(treeSet);

    }

    //sorted by Key natural order, can't be sorted by value
    public static void exampleTreeMap(){
        System.out.println("TreeMap with natural order sorting by Key");
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("4",4);
        treeMap.put("2",2);
        treeMap.put("7",7);
        treeMap.put("1",1);
        treeMap.put("102",102);
        System.out.println("TreeMap1:");
        System.out.println(treeMap);

        TreeMap<Integer,String> treeMap2 = new TreeMap<>();
        treeMap2.put(4,"4");
        treeMap2.put(2, "2");
        treeMap2.put(7,"7");
        treeMap2.put(1,"1");
        treeMap2.put(102,"102");
        System.out.println("TreeMap2:");
        System.out.println(treeMap2);


        System.out.println("TreeMap with reversed order sorting by Key");
        TreeMap<Integer, String> m =
                new TreeMap<>(Comparator.reverseOrder());
        m.put(1, "Apple");
        m.put(4, "Mango");
        m.put(5, "Orange");
        m.put(2, "Banana");
        m.put(3, "Grapes");
        System.out.println("Elements of the TreeMap " +
                "after sorting are : " + m);
    }

    //for sorting by Value
    public static void exampleSortedMap(){
        SortedSet<Entry<String, Double>> sortedset = new TreeSet<>(
                Entry.comparingByValue());

        SortedMap<String, Double> myMap = new TreeMap<>();
        myMap.put("a", 10.0);
        myMap.put("d", 2.0);
        myMap.put("c", 11.0);
        myMap.put("b", 9.0);
        System.out.println("Original SortedMap: " + myMap);
        sortedset.addAll(myMap.entrySet());

        System.out.println("After sorting by value" + sortedset);
    }

}
