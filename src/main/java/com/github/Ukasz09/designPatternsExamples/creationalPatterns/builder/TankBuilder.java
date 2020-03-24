package com.github.Ukasz09.designPatternsExamples.creationalPatterns.builder;

import com.github.Ukasz09.designPatternsExamples.creationalPatterns.builder.tankAssets.CrewType;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.builder.tankAssets.Nation;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.builder.tankAssets.VehicleTypes;

import java.util.ArrayList;
import java.util.List;

public final class TankBuilder {
    private Nation nation;
    private VehicleTypes vehicleType;
    private double cost;
    private List<CrewType> crew;
    private double topSpeed;
    private double weight;
    private double viewRange;

    //----------------------------------------------------------------------------------------------------------------//
    private TankBuilder() {
        crew = new ArrayList<>();
    }

    //----------------------------------------------------------------------------------------------------------------//
    public static TankBuilder aTank() {
        return new TankBuilder();
    }

    public TankBuilder withNation(Nation nation) {
        this.nation = nation;
        return this;
    }

    public TankBuilder withVehicleType(VehicleTypes vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }

    public TankBuilder withCost(double cost) {
        this.cost = cost;
        return this;
    }

    public TankBuilder withCrew(List<CrewType> crew) {
        this.crew = crew;
        return this;
    }

    public TankBuilder withTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
        return this;
    }

    public TankBuilder withWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public TankBuilder withViewRange(double viewRange) {
        this.viewRange = viewRange;
        return this;
    }

    public Tank build() {
        Tank tank = new Tank();
        tank.setNation(nation);
        tank.setVehicleType(vehicleType);
        tank.setCost(cost);
        tank.setCrew(crew);
        tank.setTopSpeed(topSpeed);
        tank.setWeight(weight);
        tank.setViewRange(viewRange);
        return tank;
    }
}
