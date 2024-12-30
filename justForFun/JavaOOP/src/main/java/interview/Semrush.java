package interview;

import java.util.List;
import java.util.stream.Collectors;

public class Semrush {
//    ["abc1", "f34oo", "bar"] => ["abc", "foo", "bar"]


    //return List without numbers
    public static void main(String[] args) {
        List<String> list = List.of("abc1", "f34oo", "bar");
        System.out.println(deleteAllNumbersFromList(list));
    }

    public static List<String> deleteAllNumbersFromList(List<String> list){
        return list.stream().map(el -> el.replaceAll("[0-9]","")).collect(Collectors.toList());
    }


}
