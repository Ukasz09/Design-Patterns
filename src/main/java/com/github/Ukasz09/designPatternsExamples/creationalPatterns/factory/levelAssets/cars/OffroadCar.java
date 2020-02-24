package com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelAssets.cars;

import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelAssets.cars.carAssets.EngineType;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelAssets.cars.carAssets.SuspensionType;

public class OffroadCar extends Car {
    private static final double TOP_SPEED = 100;
    private static final double WEIGHT = 3000;
    private static final EngineType ENGINE_TYPE = EngineType.TDI_POWER;
    private static final SuspensionType SUSPENSION_TYPE = SuspensionType.TERRAIN_HIGH;

    //----------------------------------------------------------------------------------------------------------------//
    public OffroadCar() {
        super(TOP_SPEED, WEIGHT, ENGINE_TYPE, SUSPENSION_TYPE);
    }

    @Override
    public void startEngine() {
        System.out.println("Wrrrr.. rr..rr..brr");
    }
}
