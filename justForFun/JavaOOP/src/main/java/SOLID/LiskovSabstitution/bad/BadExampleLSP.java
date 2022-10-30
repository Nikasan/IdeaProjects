package SOLID.LiskovSabstitution.bad;

/**
 * Created by Nikasan
 */
public class BadExampleLSP {

    public static Rectangle rectangleFactory() {
        return new Square();
    }

    public static void main(String[] args) {
        Rectangle rectangle = rectangleFactory();
        rectangle.setHeight(5);
        rectangle.setHeight(2);
        System.out.println(rectangle.getSquare());
        //выведет 4 т.к. мф изменили поля родительского класса
    }
}

class Rectangle {

    int height;
    int width;

    int getSquare() {
        return height * width;
    }

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
}

class Square extends Rectangle {

    @Override
    public void setHeight(int height) {
        this.height = height;
        width = height;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
        height = width;
    }
}