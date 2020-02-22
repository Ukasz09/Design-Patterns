package com.github.Ukasz09.mediator.example;

import com.github.Ukasz09.mediator.EventType;
import com.github.Ukasz09.mediator.IComponent;

public class MediatorPatternMain {
    public static void main(String[] args) {
        ControlTower controlTower = new ControlTower();
        IPlane planePOL = new Plane(Nationality.POLISH);
        IPlane planeRUS = new Plane(Nationality.RUSSIAN);
        IPlane planeHUN = new Plane(Nationality.HUNGARIAN);
        IComponent car = new IComponent() {
            //SAM: nothing to implement
        };

        planePOL.tryToLandOnAirport(controlTower);
        planePOL.tryToLandOnAirport(controlTower);
        planeHUN.tryToLandOnAirport(controlTower);
        planeRUS.tryToLandOnAirport(controlTower);
        planePOL.pickUpFromTheAirport(controlTower);
        planeRUS.pickUpFromTheAirport(controlTower);
        planePOL.pickUpFromTheAirport(controlTower);
        controlTower.notify(car, EventType.LANDING);
    }
}
