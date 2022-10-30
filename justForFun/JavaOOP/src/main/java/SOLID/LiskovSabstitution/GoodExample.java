package SOLID.LiskovSabstitution;


/**
 * Created by Nikasan
 */

//производные классы должны быть полностью заменяемы своими базовыми классами
//object (such as a class) may be replaced by a sub-object (such as a class that extends the first class) without breaking the program.
// нельзя изменять поведение базового класса
public class GoodExample {
    public static Rectungle rectungleFactory (){
        return new Rectungle();
    }

    public static Square squareFactory (){
        return new Square();
    }

    public static void main(String[] args) {
        Rectungle rectungle = rectungleFactory();
        rectungle.setHeight(2);
        rectungle.setWidth(5);
        System.out.println(rectungle.getSquare());

        Square square = squareFactory();
        square.setSide(3);
        System.out.println(square.getSquare());
    }
}
    interface Shape{
        int getSquare();
    }

    class Square implements Shape {

        public int getSide() {
            return side;
        }

        public void setSide(int side) {
            this.side = side;
        }

        int side;

        @Override
        public int getSquare(){
            return side*side;
        }
    }

    class Rectungle implements Shape{

        int height;

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        int width;

        @Override
        public int getSquare() {
            return height*width;
        }
    }
