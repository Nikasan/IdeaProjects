package CollectionsTraining;

import io.cucumber.java.sl.In;

import java.util.ArrayDeque;
import java.util.Collections;

public class Deque {

    public static void main(String[] args) {
        ArrayDeque<Integer> deque = createDeque();

        deque.addLast(10);
        System.out.println(deque);

        System.out.println(deque.getLast());

        deque.removeFirstOccurrence(2);
        System.out.println(deque);

    }

    public static ArrayDeque<Integer> createDeque(){

        ArrayDeque<Integer> deq = new ArrayDeque<>();
        deq.add(4);
        deq.add(3);
        deq.add(2);
        deq.add(1);
        System.out.println(deq);
        return deq;
    }

    public static void test(){

    }

}
