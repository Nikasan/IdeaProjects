package interview;

public class Spotify extends Player{

//абстрактный метод всегда должен быть заимплеменчен
    public String getSong() {
        return "Spotify.getSong()";
    }

    @Override
    public void method(){
        super.method();
        String s1 = "javaguides";
        String s2 = new String("javaguides");
        System.out.println(s1.equals(s2)); //Only one object will be created and this object will be stored in the string constant pool.
    }
}
