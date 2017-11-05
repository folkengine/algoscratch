package com.folkengine.algoscratch;

import com.google.common.base.Joiner;
import com.google.common.primitives.Chars;

import java.util.*;

public class CharPurmutations {

    Set<Character> chars;

    public CharPurmutations(String s) {
        chars = stringToUniqueChars(s.replaceAll("\\s", ""));
    }

    public static Set<Character> stringToUniqueChars(String s) {
        return new HashSet<Character>(Chars.asList(s.trim().toCharArray()));
    }

    public static String setToSortedString(Set<Character> characters) {
        List<Character> charlist = new ArrayList<Character>(characters);
        Collections.sort(new ArrayList<Character>(charlist));
        return Joiner.on("").join(charlist);
    }

}
