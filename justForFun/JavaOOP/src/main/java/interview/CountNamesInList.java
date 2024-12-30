package interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class CountNamesInList {

    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Veronika", "Ivan", "Andrey", "Andrey", "Andrey", "Kate");
        printNamesAndNumbers(names);
        printNamesAndNumbers2(names);

    }

    public static <T> void printNamesAndNumbers(List<T> names) {
        Map<T, Integer> map = new HashMap<>();
        for (T i : names) {
            if (map.containsKey(i)) {
                Integer i1 = map.get(i) + 1;
                map.put(i, i1);
            } else {
                map.put(i, 1);
            }
        }
        System.out.println(map);
    }

    public static void printNamesAndNumbers2(List<String> names) {
        Map<String, Long> collect = names.stream().collect(Collectors.groupingBy(k -> k, Collectors.counting()));
        System.out.println(collect);
    }
}
