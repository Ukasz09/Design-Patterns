package com.github.Ukasz09.designPatternsExamples.creationalPatterns.builder;

import com.github.Ukasz09.designPatternsExamples.creationalPatterns.builder.tankAssets.CrewType;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.builder.tankAssets.Nation;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.builder.tankAssets.VehicleTypes;

import java.util.Arrays;

public class TankMain {
    public static void main(String[] args) {
        TankDirector tankDirector = new TankDirector();
        TankBuilder churchillIBuilder = tankDirector.ChurchillI();
        TankBuilder tKZBuilder = tankDirector.TKZ();
        TankBuilder manualMadeTank = TankBuilder.aTank()
                .withNation(Nation.GERMANY)
                .withVehicleType(VehicleTypes.MEDIUM)
                .withCost(123000)
                .withCrew(Arrays.asList(CrewType.COMMANDER, CrewType.GUNNER, CrewType.DRIVER))
                .withTopSpeed(30)
                .withViewRange(250)
                .withWeight(100000);

        System.out.println("\n");
        TankManualGenerator.print(churchillIBuilder.build());
        System.out.println("\n");
        TankManualGenerator.print(tKZBuilder.build());
        System.out.println("\n");
        TankManualGenerator.print(manualMadeTank.build());
    }
}
