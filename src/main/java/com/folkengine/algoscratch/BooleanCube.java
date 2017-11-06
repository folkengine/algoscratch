package com.folkengine.algoscratch;

import lombok.Getter;

/**
 * 1:
 * [0][0][0] [0][1][0] [0][2][0]
 * [1][0][0] [1][1][0] [1][2][0]
 * [2][0][0] [2][1][0] [2][2][0]
 *
 * mid:
 * [0][0][1] [0][1][1] [0][2][1]
 * [1][0][1] [1][1][1] [1][2][1]
 * [2][0][1] [2][1][1] [2][2][1]
 *
 * 6:
 * [0][0][2] [0][1][2] [0][2][2]
 * [1][0][2] [1][1][2] [1][2][2]
 * [2][0][2] [2][1][2] [2][2][2]
 */
public class BooleanCube {

    @Getter private final int size;
    @Getter private boolean cube[][][];

    public BooleanCube(int size) {
        this.size = size;
        cube = new boolean[size][size][size];
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        
        return "";
    }

}
