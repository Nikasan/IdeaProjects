/**
 * Created by Nikasan
 */
public class JavaTypes {

//    Data types are divided into two groups:
//    Primitive data types - includes byte, short, int, long, float, double, boolean and char
    byte b1 = -128;
    byte b2 = 127;  //1 byte

    short sh1 = -32768;
    short sh2 = 32767;  //2 bytes

    int i1 = -2147483648;
    int i2 = 2147483647; //4 bytes

    long l1 = -9223372036854775808L;
    long l2 = 9223372036854775807L; //8 bytes

    float f1 = 1.09876565656f; // 4 bytes
    double d1 = 1.8793874593874598; // 8 bytes

    boolean b; // 1 bit
    char ch = '.'; //2 bytes

    public static void main(String[] args) {
        JavaTypes javaTypes = new JavaTypes();
        System.out.println(javaTypes.ch);
    }

//    Non-primitive data types - such as String, Arrays and Classes


}
