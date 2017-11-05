package com.folkengine.algoscratch;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharPurmutationsTest {

    @Test
    void charPurmutations() {
        assertEquals(Set.of('c', 'd', 'e'), new CharPurmutations(" d ee c c d c").getChars());
    }

    @Test
    void stringToUniqueChars() {
        assertEquals(Set.of('a', 'b', 'c'), CharPurmutations.stringToUniqueChars("ccbcaabaabcbaaabb"));
    }

    @Test
    void setToSortedList() {
        assertEquals(
                List.of('A', 'B', 'D'),
                CharPurmutations.setToSortedList(Set.of('D', 'A', 'B')));
    }

    @Test
    void setToSortedString() {
        Set<Character> chars = CharPurmutations.stringToUniqueChars(" CBA ");

        assertEquals("ABC", CharPurmutations.setToSortedString(chars));
    }

    @Test
    void permutations() {
        // assertEquals(Set.of("AB", "BA"), new CharPurmutations("BA").getPermutations());
        assertEquals(Set.of("ABC", "ACB", "BAC", "BCA", "CBA", "CAB"), new CharPurmutations("ABC").getPermutations());
    }
}

