package Lambdas_01_01;

public class LambdaExpressions {

    public static void main(String[] args) {

        IAdd add = (a, b) -> {
            int res = a + b;
            System.out.println(res);
            return res;
        };
        add.add(2, 5);
    }
}
