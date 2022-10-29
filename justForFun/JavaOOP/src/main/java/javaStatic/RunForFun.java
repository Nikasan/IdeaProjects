package javaStatic;
import javaStatic.BelarussianTime.TimeDateMinsk;

public class RunForFun {
        public static void main(String[] args) {

            BelarussianTime blr = new BelarussianTime();
            //class instance has access to:
            // non-static fields
            String i_am_public = blr.I_AM_PUBLIC;
            //non-static methods
            String europeTime_ = blr.getEuropeTime_();
            String localDate_ = blr.getLocalDate_();

            //class has access to:
            //static fields;
            String iAmPublicStatic = BelarussianTime.I_AM_PUBLIC_STATIC;
            //static method
            String europeTime = BelarussianTime.getEuropeTime();

            TimeDateMinsk staticInstance = new TimeDateMinsk();//we can create instance of static class

            staticInstance.callPrivateStaticMethod();

            BelarussianTime.InnerBellarus innerBellarus = blr.new InnerBellarus();
        }
}
