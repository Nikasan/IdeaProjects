package interview;

public class Disco {
    public static void main(String[] args) {
        Player sp = new Spotify();
        sp.method();
        System.out.println(sp.getSong());

        //StackOverflowError:
//     Disco.main(new String[]{"g"});

    }
}
