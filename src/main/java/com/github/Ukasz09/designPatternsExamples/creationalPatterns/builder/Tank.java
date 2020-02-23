package com.github.Ukasz09.designPatternsExamples.creationalPatterns.builder;

import com.github.Ukasz09.designPatternsExamples.creationalPatterns.builder.tankAssets.CrewType;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.builder.tankAssets.Nation;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.builder.tankAssets.VehicleTypes;

import java.util.List;

public class Tank implements ITank {
    private Nation nation;
    private VehicleTypes vehicleType;
    private double cost;
    private List<CrewType> crew;
    private double topSpeed;
    private double weight;
    private double viewRange;

    //----------------------------------------------------------------------------------------------------------------//
    Tank() {
    }

    //----------------------------------------------------------------------------------------------------------------//
    @Override
    public Nation getNation() {
        return nation;
    }

    @Override
    public VehicleTypes getVehicleType() {
        return vehicleType;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public List<CrewType> getCrew() {
        return crew;
    }

    @Override
    public double getTopSpeed() {
        return topSpeed;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public double getViewRange() {
        return viewRange;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    public void setVehicleType(VehicleTypes vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setCrew(List<CrewType> crew) {
        this.crew = crew;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setViewRange(double viewRange) {
        this.viewRange = viewRange;
    }
}
