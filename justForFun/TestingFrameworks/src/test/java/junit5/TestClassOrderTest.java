package junit5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.ClassOrderer;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * Created by Nikasan
 */
// is a type-level annotation that is used to configure a ClassOrderer for the @Nested test classes of the annotated test class.
@TestClassOrder(ClassOrderer.OrderAnnotation.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(Lifecycle.PER_CLASS)
class TestClassOrderTest {


    void beforeAll(){
        System.out.println("Before all from TestClassOrderTest");
    }
    @Test
    @Order(3)
    void test2() {
        System.out.println("I am test2");
    }

    @Nested
    @Order(5)
    @TestInstance(Lifecycle.PER_CLASS)
    class nestedTest1 {
        @BeforeAll
        void beforeAll(){
            System.out.println("Before all from nestedTest1");
        }

        @Test
        @Order(2)
        void nestedTest2() {
            System.out.println("I am nested test2");
        }

        @Test
        @Order(1)
        void nestedTest1() {
            System.out.println("I am nested test1");
        }
    }

    @Nested
    @Order(2)
    class nestedTest3 {

        @Test
        void nestedTest3() {
            System.out.println("I am nested test3");
        }
    }

}
