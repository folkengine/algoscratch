package com.folkengine.algoscratch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooleanCubeTest {

    @Test
    public void booleanCube() {
        assertEquals(3, new BooleanCube(3).getSize());
    }

}