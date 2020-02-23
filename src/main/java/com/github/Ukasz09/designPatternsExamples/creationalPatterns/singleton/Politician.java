package com.github.Ukasz09.designPatternsExamples.creationalPatterns.singleton;

public class Politician {
    private int id;
    private double moneyStolenFromGovernment = 0;

    //----------------------------------------------------------------------------------------------------------------//
    public Politician(int id) {
        this.id = id;
    }

    //----------------------------------------------------------------------------------------------------------------//
    public void madeCorruptionScandal() {
        moneyStolenFromGovernment += Government.getInstance().madeCorruptionScandal(id);
    }

    //----------------------------------------------------------------------------------------------------------------//
    public double getStolenMoneyFromGovernment() {
        return moneyStolenFromGovernment;
    }

    public int getId() {
        return id;
    }
}
