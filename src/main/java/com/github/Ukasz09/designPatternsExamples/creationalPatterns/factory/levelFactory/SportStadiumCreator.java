package com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelFactory;

import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelAssets.Backgrounds;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelAssets.cars.Car;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelAssets.cars.SportCar;

public class SportStadiumCreator extends LevelCreator {
    @Override
    protected Car createCar() {
        return new SportCar();
    }

    @Override
    protected Backgrounds createBackground() {
        return Backgrounds.CARTING_SPORT_STADION;
    }
}
