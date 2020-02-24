package com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelAssets.cars;

import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelAssets.cars.carAssets.EngineType;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelAssets.cars.carAssets.SuspensionType;

public class VWGolf extends Car {
    private static final double TOP_SPEED = 180;
    private static final double WEIGHT = 1900;
    private static final EngineType ENGINE_TYPE = EngineType.CASUAL;
    private static final SuspensionType SUSPENSION_TYPE = SuspensionType.NORMAL;

    //----------------------------------------------------------------------------------------------------------------//
    public VWGolf() {
        super(TOP_SPEED, WEIGHT, ENGINE_TYPE, SUSPENSION_TYPE);
    }

    @Override
    public void startEngine() {
        System.out.println("Brum brummm..");
    }
}
