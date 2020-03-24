package com.github.Ukasz09.designPatternsExamples.creationalPatterns.prototype;

import java.util.Objects;

public class WarRobot extends Robot {
    private double hp;
    private double speed;
    private double strength;

    //----------------------------------------------------------------------------------------------------------------//
    public WarRobot(double batteryCapacity, double hp, double speed, double strength) {
        super(batteryCapacity);
        this.hp = hp;
        this.speed = speed;
        this.strength = strength;
    }

    public WarRobot(WarRobot robot) {
        super(robot);
        if (robot != null) {
            this.hp = robot.hp;
            this.speed = robot.speed;
            this.strength = robot.strength;
        }
    }

    //----------------------------------------------------------------------------------------------------------------//
    @Override
    public void doJob() {
        System.out.println(this);
        System.out.println("-Ready for fight and looking for enemy...");
    }

    @Override
    public String toString() {
        return super.toString() + "HP=" + hp + "\nSpeed=" + speed + "\nStrength=" + strength + "\n";
    }

    @Override
    public Robot clone() {
        return new WarRobot(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WarRobot warRobot = (WarRobot) o;
        return Double.compare(warRobot.hp, hp) == 0 &&
                Double.compare(warRobot.speed, speed) == 0 &&
                Double.compare(warRobot.strength, strength) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hp, speed, strength);
    }
}
