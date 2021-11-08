package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyClassTest {
    MyClass myClass;

    @BeforeEach
    void setUp(){
        myClass = new MyClass();
        System.out.println("I run before every test");
    }

    @Test
    void test_myClass_doing_success(){ //positiv test
        myClass.hoppa();

        assertEquals("hoppar", myClass.getDoing());
    }

    @Test
    void test_myClass_vila_success(){ //positiv test
        myClass.vila();

        assertEquals("vilar", myClass.getDoing());
    }
}
