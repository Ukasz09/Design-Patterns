package com.github.Ukasz09.designPatternsExamples.behavioralPatterns.mediator;

public class Plane implements IPlane {
    private Nationality planeNationality;

    //----------------------------------------------------------------------------------------------------------------//
    public Plane(Nationality planeNationality) {
        this.planeNationality = planeNationality;
    }

    //----------------------------------------------------------------------------------------------------------------//
    public void tryToLandOnAirport(IControlTowerMediator controlTower) {
        controlTower.notify(this, AirPortEvents.PLANE_LANDING);
    }

    public void pickUpFromTheAirport(IControlTowerMediator controlTower) {
        controlTower.notify(this, AirPortEvents.PLANE_PICKING_UP_FROM_AIRPORT);
    }

    @Override
    public Nationality getNationality() {
        return planeNationality;
    }
}
