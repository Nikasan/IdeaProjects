package junit5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

/**
 * Created by Nikasan
 */
@TestInstance(Lifecycle.PER_CLASS)
class TestInstanceAnnotationTest {

    int sum =0;
    @BeforeAll
    void beforeAll(){
        System.out.println("I am before all");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("I am before each");
    }

    @AfterAll
    void afterAll(){
        System.out.println("I am after all");
    }

    @AfterEach
    void afterEach(){
        System.out.println("I am after each");
    }

    @Test
    @JUnit5Tutorial
    @DisplayName("I am test1()")
    void test1(){
        System.out.println("I am test1 method");
        sum = sum +1;
        System.out.println(sum);
    }

    @Test
    @DisplayName("I am test2()")
    void test2(){
        System.out.println("I am test2 method");
        sum = sum +1;
        System.out.println(sum);
    }

}
