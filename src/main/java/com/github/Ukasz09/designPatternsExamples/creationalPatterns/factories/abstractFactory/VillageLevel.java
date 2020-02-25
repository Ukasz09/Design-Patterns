package com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.abstractFactory;

import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.Backgrounds;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.cars.Car;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.cars.VWGolf;

public class VillageLevel implements ILevelFactory {
    @Override
    public Car createCar() {
        return new VWGolf();
    }

    @Override
    public Backgrounds createBackground() {
        return Backgrounds.TUMIDAJ_VILLAGE;
    }
}
