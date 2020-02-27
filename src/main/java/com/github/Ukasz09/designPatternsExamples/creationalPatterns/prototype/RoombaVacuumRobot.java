package com.github.Ukasz09.designPatternsExamples.creationalPatterns.prototype;

import java.util.Objects;

public class RoombaVacuumRobot extends Robot {
    private double dustContainerCapacity;

    //----------------------------------------------------------------------------------------------------------------//
    public RoombaVacuumRobot(double batteryCapacity, double dustContainerCapacity) {
        super(batteryCapacity);
    }

    public RoombaVacuumRobot(RoombaVacuumRobot robot) {
        super(robot);
        if (robot != null)
            this.dustContainerCapacity = robot.dustContainerCapacity;
    }

    //----------------------------------------------------------------------------------------------------------------//
    @Override
    public void doJob() {
        System.out.println(this);
        System.out.println("- Is ready for vacuum job");
    }

    @Override
    public String toString() {
        return super.toString() + "Dust container=" + dustContainerCapacity + "\n";
    }

    @Override
    public Robot clone() {
        return new RoombaVacuumRobot(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RoombaVacuumRobot that = (RoombaVacuumRobot) o;
        return Double.compare(that.dustContainerCapacity, dustContainerCapacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dustContainerCapacity);
    }
}
