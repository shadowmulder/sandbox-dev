package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void run() {
        Fibonacci main = new Fibonacci();

        assertEquals(6765, main.run(0,1,20));

        assertEquals(0,main.run(0,0,20));

        assertEquals(0, main.run(0,0,0));



    }
}