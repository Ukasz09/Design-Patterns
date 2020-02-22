package com.github.Ukasz09.mediator.example;

import com.github.Ukasz09.mediator.EventType;
import com.github.Ukasz09.mediator.IComponent;
import com.github.Ukasz09.mediator.IMediator;

public class Plane implements IComponent, IPlane {
    private Nationality planeNationality;

    //----------------------------------------------------------------------------------------------------------------//
    public Plane(Nationality planeNationality) {
        this.planeNationality = planeNationality;
    }

    //----------------------------------------------------------------------------------------------------------------//
    public void tryToLandOnAirport(IMediator controlTower) {
        controlTower.notify(this, EventType.LANDING);
    }

    public void pickUpFromTheAirport(IMediator controlTower) {
        controlTower.notify(this, EventType.PICK_UP_FROM_AIRPORT);
    }

    @Override
    public Nationality getNationality() {
        return planeNationality;
    }
}
