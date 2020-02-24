package com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelFactory;

import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.Level;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelAssets.Backgrounds;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelAssets.cars.Car;

public abstract class LevelCreator {
    //----------------------------------------------------------------------------------------------------------------//
    public LevelCreator() {
    }

    //----------------------------------------------------------------------------------------------------------------//
    public Level createLevel() {
        Car car = createCar();
        Backgrounds background = createBackground();
        return new Level(car,background);
    }

    protected abstract Car createCar();

    protected abstract Backgrounds createBackground();
}
