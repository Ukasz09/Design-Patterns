package com.github.Ukasz09.designPatternsExamples.creationalPatterns.builder;

import com.github.Ukasz09.designPatternsExamples.creationalPatterns.builder.tankAssets.CrewType;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.builder.tankAssets.Nation;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.builder.tankAssets.VehicleTypes;

import java.util.Arrays;

public class TankDirector {
    public TankBuilder ChurchillI() {
        return TankBuilder.aTank()
                .withNation(Nation.UK)
                .withVehicleType(VehicleTypes.HEAVY)
                .withCost(340000)
                .withCrew(Arrays.asList(CrewType.COMMANDER, CrewType.DRIVER, CrewType.GUNNER, CrewType.GUNNER, CrewType.LOADER))
                .withTopSpeed(25.7)
                .withViewRange(330)
                .withWeight(39000);
    }

    public TankBuilder TKZ() {
        return TankBuilder.aTank()
                .withNation(Nation.POLAND)
                .withVehicleType(VehicleTypes.LIGHT)
                .withCost(30000)
                .withCrew(Arrays.asList(CrewType.COMMANDER, CrewType.DRIVER))
                .withTopSpeed(45)
                .withViewRange(290)
                .withWeight(3500);
    }
}
