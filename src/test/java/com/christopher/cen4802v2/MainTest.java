package com.christopher.cen4802v2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @DisplayName("Fibonacci method test.")
    @Test
    void fibTest(){
        assertEquals(5,Main.fibonacci(10));
    }
}