package com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelFactory;

import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelAssets.Backgrounds;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelAssets.cars.Car;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelAssets.cars.VWGolf;

public class VillageCreator extends LevelCreator {
    @Override
    protected Car createCar() {
        return new VWGolf();
    }

    @Override
    protected Backgrounds createBackground() {
        return Backgrounds.TUMIDAJ_VILLAGE;
    }
}
