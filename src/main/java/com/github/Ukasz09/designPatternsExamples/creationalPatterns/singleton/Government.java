package com.github.Ukasz09.designPatternsExamples.creationalPatterns.singleton;

import com.github.Ukasz09.designPatternsExamples.creationalPatterns.builder.tankAssets.Nation;

public class Government {
    private static Government government = null;

    private Nation country = Nation.POLAND;
    private double liabilitiesAsPercentOfPKB = 48.9;

    //----------------------------------------------------------------------------------------------------------------//
    private Government() {
    }

    //----------------------------------------------------------------------------------------------------------------//
    public static Government getInstance() {
        if (government == null)
            government = new Government();
        return government;
    }

    public double madeCorruptionScandal(int coefficient) {
        double stolenMoney = liabilitiesAsPercentOfPKB * 0.1 * coefficient;
        liabilitiesAsPercentOfPKB -= stolenMoney;
        return stolenMoney;
    }

    //----------------------------------------------------------------------------------------------------------------//
    public Nation getCountry() {
        return country;
    }

    public double getLiabilitiesAsPercentOfPKB() {
        return liabilitiesAsPercentOfPKB;
    }
}
