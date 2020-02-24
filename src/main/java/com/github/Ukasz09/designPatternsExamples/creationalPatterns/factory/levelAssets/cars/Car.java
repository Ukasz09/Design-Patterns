package com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelAssets.cars;

import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelAssets.cars.carAssets.EngineType;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelAssets.cars.carAssets.SuspensionType;

public abstract class Car {
    private double topSpeed;
    private double weight;
    private EngineType engineType;
    private SuspensionType suspensionType;

    //----------------------------------------------------------------------------------------------------------------//
    public Car(double topSpeed, double weight, EngineType engineType, SuspensionType suspensionType) {
        this.topSpeed = topSpeed;
        this.weight = weight;
        this.engineType = engineType;
        this.suspensionType = suspensionType;
    }

    //----------------------------------------------------------------------------------------------------------------//
    public void printCarInfo() {
        System.out.println("Top speed=" + topSpeed);
        System.out.println("Weight=" + weight);
        System.out.println("EngineType=" + engineType);
        System.out.println("Suspension type=" + suspensionType);
    }

    public abstract void startEngine();

    @Override
    public String toString() {
        return "Speed=" + topSpeed + "\nWeight=" + weight + "\nEngine type=" + engineType + "\nSuspension type=" + suspensionType + "\n";
    }
}
