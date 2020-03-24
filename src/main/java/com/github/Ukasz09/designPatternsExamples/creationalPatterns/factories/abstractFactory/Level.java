package com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.abstractFactory;

import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.Backgrounds;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.cars.Car;

public class Level {
    private int number;
    private Car car;
    private Backgrounds background;

    //----------------------------------------------------------------------------------------------------------------//
    public Level(int number, ILevelFactory levelFactory) {
        this.number = number;
        car = levelFactory.createCar();
        background = levelFactory.createBackground();
    }

    //----------------------------------------------------------------------------------------------------------------//
    public void startLevel() {
        showLevelInfo();
        startAnimations();
    }

    private void showLevelInfo() {
        System.out.println("Level no." + number + "\n");
        System.out.println("BACKGROUND: " + background);
        System.out.println("CAR: \n" + car);
    }

    private void startAnimations() {
        System.out.println("Animation has been started\n");
    }
}
