package staticTrening;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class BelarussianTime {
    public static String I_AM_PUBLIC_STATIC = "public_STATIC";
    public String I_AM_PUBLIC = "public_STRING";

    private static final String STATIC_FIELD = LocalDateTime.now(ZoneId.of("ECT")).toString(); //static field
    private String NON_STATIC_FIELD = LocalDateTime.now().toString(); //non-static field

    public static String getEuropeTime() {return STATIC_FIELD;} //static method has access to static variable

   // public static String getLocalDate() {return NON_STATIC_FIELD;} //static method has NOT access to NON static variable

    public String getEuropeTime_(){return STATIC_FIELD;}    //NON static method has access to all types of variables
    public String getLocalDate_(){return NON_STATIC_FIELD;}

    //static class
    public static class TimeDateMinsk {
        String str = I_AM_PUBLIC_STATIC; //static class has access to static variables
    //    String str_ = I_AM_PUBLIC; //static class has NO access to NON static variables

        public String callStaticMethod() {
            return getEuropeTime();
        }//static method can be called from static context only - static class

    //    public String callNONStaticMethod() {
    //        return getEuropeTime_();  // NON static method can NOT be called from static context - static class
    //    }
    }

    public class InnerBellarus {   //has access to all fields and methods
        public void getStaticMethodFromInnerClass(){
            String europeTime = getEuropeTime();
            String europeTime_ = getEuropeTime_();
            String iAmPublicStatic = I_AM_PUBLIC_STATIC;
            String i_am_public = I_AM_PUBLIC;
        }
    }
}
