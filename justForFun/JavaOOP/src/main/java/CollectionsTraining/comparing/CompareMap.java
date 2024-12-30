package CollectionsTraining.comparing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CompareMap {

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        map1.put("1", 1);
        map1.put("2", 2);
        map1.put("3", 3);
        map2.put("2", 2);
        map2.put("3", 3);
        map2.put("1", 1);
        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map1.equals(map2));

        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");

        System.out.println(map2.equals(set));
        System.out.println(map2.keySet().equals(set));
    }

}
