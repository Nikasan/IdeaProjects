package udemy_java_basic_course.access_modifiers.animals;

import udemy_java_basic_course.access_modifiers.cats.Cat;

public class Yarik extends Cat {

   protected Yarik(int age, String name)
   {
       super(age,name);
   }

   Yarik(){}
}
