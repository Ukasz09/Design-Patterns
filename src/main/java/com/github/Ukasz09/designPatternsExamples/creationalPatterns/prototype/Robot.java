package com.github.Ukasz09.designPatternsExamples.creationalPatterns.prototype;

import java.util.Objects;

public abstract class Robot {
    private double batteryCapacity;

    //----------------------------------------------------------------------------------------------------------------//
    public Robot(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public Robot(Robot robot) {
        if (robot != null)
            this.batteryCapacity = robot.batteryCapacity;
    }

     //----------------------------------------------------------------------------------------------------------------//
    public abstract void doJob();

    @Override
    public String toString() {
        return "Robot with stats:\nBattery=" + batteryCapacity + "\n";
    }

    public abstract Robot clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Robot robot = (Robot) o;
        return Double.compare(robot.batteryCapacity, batteryCapacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity);
    }
}
