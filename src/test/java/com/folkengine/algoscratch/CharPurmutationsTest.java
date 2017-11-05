package com.folkengine.algoscratch;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CharPurmutationsTest {

    @Test
    void stringToUniqueChars() {

        Set<Character> chars = Set.of('a', 'b', 'c');

        assertEquals(chars, CharPurmutations.stringToUniqueChars("ccbcaabaabcbaaabb"));
    }

    @Test
    void setToSortedString() {
        Set<Character> chars = CharPurmutations.stringToUniqueChars(" CBA ");

        assertEquals("ABC", CharPurmutations.setToSortedString(chars));
    }
}