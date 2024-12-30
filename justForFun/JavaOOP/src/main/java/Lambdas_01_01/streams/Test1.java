package Lambdas_01_01.streams;

import io.cucumber.java.sl.In;

import java.util.List;
import java.util.Optional;


public class Test1 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 0, 3);
        System.out.println(multiplyListElements(list));



    }

    public static Integer multiplyListElements(List<Integer> list) {
        if (list.stream().anyMatch(x -> x == 0)) {
            return 0;
        } else {
            return list.stream().reduce((result, x) -> result * x).get();
        }
    }
}
