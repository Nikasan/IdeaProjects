package junit5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * Created by Nikasan
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TestMethodOrderTest {

    static int sum = 0;

    @BeforeAll
    static void beforeAll() {
        System.out.println("I am before all");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("I am before each");
    }

    @Test
    @Order(2)
    @DisplayName("I am test2()")
    void test2() {
        System.out.println("I am test2 method");
        sum = sum + 1;
        System.out.println(sum);
    }

    @Test
    @Order(1)
    @DisplayName("I am test1()")
    void test1() {
        System.out.println("I am test1 method");
        sum = sum + 1;
        System.out.println(sum);
    }


}
