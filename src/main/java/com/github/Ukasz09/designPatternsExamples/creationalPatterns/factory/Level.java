package com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory;

import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelAssets.Backgrounds;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelAssets.cars.Car;

public class Level {
    private Car car;
    private Backgrounds background;

    //----------------------------------------------------------------------------------------------------------------//
    public Level(Car car, Backgrounds background) {
        this.car = car;
        this.background = background;
    }

    public void showLevelInfo() {
        System.out.println("BACKGROUND: " + background);
        System.out.println("CAR: \n" + car);
    }
}
