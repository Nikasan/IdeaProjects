package CollectionsTraining;

import java.util.Iterator;
import java.util.TreeSet;

public class Trees {

    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(2);
        treeSet.add(7);
        treeSet.add(1);
        treeSet.add(102);
        System.out.println("TreeSet:");
        Iterator iterator = treeSet.stream().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();


    }

}
