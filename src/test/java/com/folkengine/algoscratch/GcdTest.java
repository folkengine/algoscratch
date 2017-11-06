package com.folkengine.algoscratch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GcdTest {

    @Test
    public void gcd() {
        assertEquals(1, Gcd.go(3, 5));
        assertEquals(12, Gcd.go(12, 60));
        assertEquals(12, Gcd.go(60, 12));
        assertEquals(6, Gcd.go(12, 90));
        assertEquals(6, Gcd.go(90, 12));
    }

}