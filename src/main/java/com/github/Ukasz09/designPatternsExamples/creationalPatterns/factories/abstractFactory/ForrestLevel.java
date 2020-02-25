package com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.abstractFactory;

import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.Backgrounds;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.cars.Car;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.cars.OffroadCar;

public class ForrestLevel implements ILevelFactory {
    @Override
    public Car createCar() {
        return new OffroadCar();
    }

    @Override
    public Backgrounds createBackground() {
        return Backgrounds.FORREST_BACKGROUND;
    }
}
