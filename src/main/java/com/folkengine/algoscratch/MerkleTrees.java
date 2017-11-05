package com.folkengine.algoscratch;

import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

public class MerkleTrees {

    private String root;
    private List<String> transactions;

    public MerkleTrees(List<String> transactions) {
        this.transactions = transactions;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public void merkle_tree() {
        List<String> tempTxList = new ArrayList<String>();

        for (int i = 0; i < this.transactions.size(); i++) {
            tempTxList.add(this.transactions.get(i));
        }

        List<String> newTxList = getNewTxList(tempTxList);
        while (newTxList.size() != 1) {
            newTxList = getNewTxList(newTxList);
        }

        this.root = newTxList.get(0);
    }

    private List<String> getNewTxList(List<String> tempTxList) {

        List<String> newTxList = new ArrayList<String>();
        int index = 0;
        while (index < tempTxList.size()) {
            // left
            String left = tempTxList.get(index);
            index++;

            // right
            String right = "";
            if (index != tempTxList.size()) {
                right = tempTxList.get(index);
            }

            String sha2HexValue = Hashing.sha256()
                    .hashString(left + right, StandardCharsets.UTF_8)
                    .toString();
            newTxList.add(sha2HexValue);
            index++;
        }

        return newTxList;
    }

    public String getRoot() {
        return root;
    }
}
