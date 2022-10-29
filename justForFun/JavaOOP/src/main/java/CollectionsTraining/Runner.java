package CollectionsTraining;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Created by Nikasan
 */
public class Runner {

    public static void main(String[] args) {

//        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("mam", "pap"));
//        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(3,5,7));
//        Collections.sort(list1);


//        int[] a = new int[]{1, 2, 3, 4, 5, 6};
//
        CollectionsExamples ex = new CollectionsExamples();
//        System.out.println(ex.revertCollectionElements(list1));
//        System.out.println(ex.arraySum(a));
//        System.out.println(ex.containsNumber(a, 2));

        //last-in-first-out data structure
//        Stack<String> stack = new Stack<>();
//        stack.push("Ayush");
//        stack.push("Garvit");
//        stack.push("Amit");
//        stack.push("Ashish");
//        stack.push("Garima");
//        stack.pop();  //delete last entered element
//        System.out.println("peek() method result is: " + stack.peek());
//        stack.add("Garima");
//        for (String s : stack) {
//            System.out.println(s);
//        }

//        TreeSet<Integer> integerTreeSet = new TreeSet<>(Arrays.asList(1,4,3,6,2));
////        TreeSet<String> stringTreeSet = new TreeSet<>(Arrays.asList("l","k","j"));
//        TreeSet<String> stringTreeSet = new TreeSet<>(Arrays.asList("в","а","б"));
//        System.out.println(integerTreeSet);
//        System.out.println(stringTreeSet);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(44, "x");
        map.put(3, "c");
        map.put(2, "b");
        System.out.println(map);
//        Set<Entry<Integer, String>> entries = map.entrySet();
//        System.out.println(entries);
//        Set<Integer> integers = map.keySet();
//        System.out.println(integers);
//        Collection<String> values = map.values();
//        System.out.println(values);

        System.out.println(ex.sortMapByKey(map));
        System.out.println(ex.sortMapByValue(map));
    }
}