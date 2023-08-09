package udemy_java_basic_course.non_access_modifiers;

public class Runner {
    public static void main(String[] args) {
//        FinalTrainingClone cl = new FinalTrainingClone();
//        System.out.println(cl.fn);
//        cl.finalMethod(2);

        FinalClass fc = new FinalClass();
        fc.a = 6;
        System.out.println(fc.a);
    }
}
