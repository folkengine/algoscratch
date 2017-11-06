package com.folkengine.algoscratch;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
class BooleanCubeTest {

    @Test
    public void booleanCube() {
        assertEquals(3, new BooleanCube(3).getSize());
    }

    @Test
    public void myToString() {
        log.debug(new BooleanCube(4).toString());
        assert(true);
    }

}