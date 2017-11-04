package com.folkengine.algoscratch;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MerkleTreesTest {

    private static List<String> transactions;

    @BeforeAll

    public static void before() {
        transactions = new ArrayList<String>();
        transactions.add("a");
        transactions.add("b");
        transactions.add("c");
        transactions.add("d");
        transactions.add("e");
    }

    @Test
    public void merkleeTrees() throws Exception {
        MerkleTrees sut = new MerkleTrees(new ArrayList<String>());
        assertEquals(0, sut.getTransactions().size());
    }

    @Test
    public void getRoot() throws Exception {
        MerkleTrees sut = new MerkleTrees(transactions);
        sut.merkle_tree();
        assertEquals("3b7e1e6ba3b82975d7802511d8c7fabbe7a5d112d0dd112fbcfbb7e6417a3214", sut.getRoot());
    }

}
