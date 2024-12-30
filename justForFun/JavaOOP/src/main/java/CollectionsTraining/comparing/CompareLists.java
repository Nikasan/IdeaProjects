package CollectionsTraining.comparing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareLists {

    public static void main(String[] args) {
        List<String> one = Arrays.asList("a","b","c");
        List<String> two = Arrays.asList("a","b","c");
        List<String> tree = Arrays.asList("c","b","a");
        System.out.println(one.equals(two));
        System.out.println(one.equals(tree));

        Comparator<String> comp = Comparator.comparing(String::toString);
        tree.sort(comp);
        Collections.sort(tree);
        System.out.println(one.equals(tree));
        System.out.println(one==two);
    }
}
