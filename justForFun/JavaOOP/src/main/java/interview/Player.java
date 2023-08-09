package interview;

public abstract class Player {

    public void method(){
        System.out.println('j' + 'a' + 'v' + 'a'); // java doesn't allow concatenate literals
        System.out.println("j" + "a" + "v" + "a"); // java but allows concatenat Strings
    }

    public abstract String getSong(); // не может быть тела абстрактого метода
//    {
//        return "sing";
//    };


    //спросить про метод оверлоадинг
    public static void getText(){
        System.out.println("Hello");
    }

    public static String getText(String g){
        return "Hello";
    }

}
