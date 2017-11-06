package com.folkengine.algoscratch;

import com.google.common.base.Joiner;
import com.google.common.primitives.Chars;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import lombok.val;

import java.util.*;

@EqualsAndHashCode
@Log4j2
public class CharPurmutations {

    @Getter private final Set<Character> chars;
    @Getter private Set<String> permutations = new HashSet<>();

    /**
     * Takes a String, strips out any whitespace, and converts it into a Set of chars.
     * Then calculates all unique permutations of those chars.
     *
     * @param s
     */
    public CharPurmutations(String s) {
        chars = stringToUniqueChars(s.replaceAll("\\s", ""));
        permute();
    }

    public static Set<Character> stringToUniqueChars(String s) {
        return new HashSet<Character>(Chars.asList(s.trim().toCharArray()));
    }

    public static List<Character> setToSortedList(Set<Character> characters) {
        val charlist = new ArrayList<Character>(characters);
        Collections.sort(charlist);
        return charlist;
    }

    public static String setToSortedString(Set<Character> characters) {
        return Joiner.on("").join(setToSortedList(characters));
    }

    private void add(List<Character> clist) {
        String perm = Joiner.on("").join(clist);
        if (permutations.contains(perm)) {
            log.debug(perm + " already exists");
        }
        log.debug(String.format("Adding %s", perm));
        permutations.add(perm);
    }

    private void permute() {
        List<Character> sortedChars = setToSortedList(chars);

        permute(setToSortedList(chars), 0, chars.size() - 1);
    }

    private void permute(List<Character> clist, int left, int right) {
        log.debug(String.format("permute(%s, %d, %d)", clist.toString(), left, right));
        if (left == right) {
            add(clist);
        } else {
            for (int x = 0; x <= right; x++) {
                clist = swap(clist, left, x);
                log.debug(String.format(">>> %d: pre  swapping %s & %s %s, %d, %d", x, clist.get(left), clist.get(x), clist.toString(), left, right));
                permute(clist, left + 1, right);
                clist = swap(clist, left, x);
                log.debug(String.format(">>> %d: post swapping %s & %s %s, %d, %d", x, clist.get(left), clist.get(x), clist.toString(), left, right));
            }
        }
    }

    private List<Character> swap(List<Character> clist, int i, int j) {
        char temp = clist.get(i);
        clist.set(i, clist.get(j));
        clist.set(j, temp);
        return clist;
    }
}
