package com.github.Ukasz09.designPatternsExamples.creationalPatterns.builder;

public class TankManualGenerator {
    public static void print(ITank tank) {
        System.out.println("Cost= " + tank.getCost());
        System.out.println("Crew= " + tank.getCrew());
        System.out.println("Nation= " + tank.getNation());
        System.out.println("Speed= " + tank.getTopSpeed());
        System.out.println("Type= " + tank.getVehicleType());
        System.out.println("View range= " + tank.getViewRange());
        System.out.println("Weight=" + tank.getWeight());
    }

}
