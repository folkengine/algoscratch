package com.folkengine.algoscratch;

import com.folkengine.algoscratch.MerkleTrees;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MerkleTreesTest {

    @Test
    public void merkleeTrees() throws Exception {
        MerkleTrees sut = new MerkleTrees(new ArrayList<String>());
        assertEquals(0, sut.getTransactions().size());
    }

}
