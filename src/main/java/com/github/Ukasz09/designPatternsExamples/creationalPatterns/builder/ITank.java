package com.github.Ukasz09.designPatternsExamples.creationalPatterns.builder;

import com.github.Ukasz09.designPatternsExamples.creationalPatterns.builder.tankAssets.CrewType;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.builder.tankAssets.Nation;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.builder.tankAssets.VehicleTypes;

import java.util.List;

public interface ITank {
    Nation getNation();

    VehicleTypes getVehicleType();

    double getCost();

    List<CrewType> getCrew();

    double getTopSpeed();

    double getWeight();

    double getViewRange();
}
