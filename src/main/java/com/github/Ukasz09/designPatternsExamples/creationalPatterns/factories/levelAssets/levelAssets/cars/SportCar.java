package com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.cars;

import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.cars.carAssets.EngineType;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.cars.carAssets.SuspensionType;

public class SportCar extends Car {
    private static final double TOP_SPEED = 300;
    private static final double WEIGHT = 1000;
    private static final EngineType ENGINE_TYPE = EngineType.V8_SPORT;
    private static final SuspensionType SUSPENSION_TYPE = SuspensionType.LOW;

    //----------------------------------------------------------------------------------------------------------------//
    public SportCar() {
        super(TOP_SPEED, WEIGHT, ENGINE_TYPE, SUSPENSION_TYPE);
    }

    @Override
    public void startEngine() {
        System.out.println("Lututu tut ut tu tu tuut..");
    }
}
