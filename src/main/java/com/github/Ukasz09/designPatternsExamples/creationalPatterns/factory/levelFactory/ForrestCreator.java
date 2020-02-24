package com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelFactory;

import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelAssets.Backgrounds;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelAssets.cars.Car;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelAssets.cars.OffroadCar;

public class ForrestCreator extends LevelCreator {
    @Override
    protected Car createCar() {
        return new OffroadCar();
    }

    @Override
    protected Backgrounds createBackground() {
        return Backgrounds.FORREST_BACKGROUND;
    }
}
