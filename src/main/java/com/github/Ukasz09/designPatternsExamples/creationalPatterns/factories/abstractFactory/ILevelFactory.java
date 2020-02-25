package com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.abstractFactory;

import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.Backgrounds;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.cars.Car;

public interface ILevelFactory {
    Car createCar();
    Backgrounds createBackground();
}
