package com.folkengine.algoscratch;

import java.util.List;

public class MerkleTrees {

    private List<String> transactions;

    public MerkleTrees(List<String> transactions) {
        this.transactions = transactions;
    }

    public List<String> getTransactions() {
        return transactions;
    }
}
