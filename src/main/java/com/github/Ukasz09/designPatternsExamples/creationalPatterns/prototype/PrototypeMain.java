package com.github.Ukasz09.designPatternsExamples.creationalPatterns.prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        withoutRegistryPresentation();
    }

    private static void withoutRegistryPresentation() {
        RoombaVacuumRobot vacuumRobot = new RoombaVacuumRobot(450, 500);
        WarRobot spyRobot = new WarRobot(100, 50, 400, 50);
        System.out.println("Before copy:\n" + spyRobot + "\n" + vacuumRobot);

        RoombaVacuumRobot vacuumRobotClone1 = (RoombaVacuumRobot) vacuumRobot.clone();
        WarRobot spyRobotClone1 = (WarRobot) spyRobot.clone();
        System.out.println("After copy:\n" + spyRobotClone1 + "\n" + vacuumRobotClone1);

        System.out.println("Robots are structural the same:\n" + spyRobot.equals(spyRobotClone1) + "\n" + vacuumRobot.equals(vacuumRobotClone1));
        System.out.println("Robots are identity the same:\n" + (spyRobot == spyRobotClone1) + "\n" + (vacuumRobot == vacuumRobotClone1));
    }
}
