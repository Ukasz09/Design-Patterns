package com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets;

import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.Backgrounds;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.cars.Car;

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

    public void startAnimations() {
        System.out.println("Animation has been started\n");
    }

    public void activateAllBonuses() {
        System.out.println("All power-up and bonuses available on level");
    }

    public void activateHiddenPassage() {
        System.out.println("Hideden passage activated");
    }
}
