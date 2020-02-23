package com.github.Ukasz09.designPatternsExamples.mediator;

import java.util.ArrayList;
import java.util.List;

public class ControlTower implements IControlTowerMediator {
    private List<IPlane> landedPlanes;
    private List<Nationality> nationalitiesBlackList;

    //----------------------------------------------------------------------------------------------------------------//
    public ControlTower() {
        landedPlanes = new ArrayList<>();
        nationalitiesBlackList = new ArrayList<>();
        nationalitiesBlackList.add(Nationality.RUSSIAN);
    }

    //----------------------------------------------------------------------------------------------------------------//
    @Override
    public void notify(IPlane sender, AirPortEvents airPortEvents) {
        switch (airPortEvents) {
            case PLANE_LANDING:
                landPlane(sender);
                break;
            case PLANE_PICKING_UP_FROM_AIRPORT:
                pickUpPlaneFromAirport(sender);
                break;
        }
    }

    private void landPlane(IPlane plane) {
        boolean landingAllowed = landingIsAllowed(plane);
        boolean planeAlreadyIsOnTheAirport = planeIsOnTheAirport(plane);
        if (landingAllowed && !planeAlreadyIsOnTheAirport)
            landedPlanes.add(plane);
        System.out.println(getLandingResult(plane, landingAllowed, planeAlreadyIsOnTheAirport));
    }

    private boolean landingIsAllowed(IPlane plane) {
        return !planeNationalityIsInBlacklist(plane);
    }

    private String getLandingResult(IPlane plane, boolean landingAllowed, boolean planeAlreadyIsOnTheAirport) {
        if (planeAlreadyIsOnTheAirport)
            return "Plane already on the airport";
        StringBuilder landingResult = new StringBuilder()
                .append("Landing ").append(landingAllowed ? "allowed" : "denied")
                .append(". (Plane nationality: ").append(plane.getNationality()).append(")");
        return landingResult.toString();
    }

    private boolean planeNationalityIsInBlacklist(IPlane plane) {
        Nationality planeNationality = plane.getNationality();
        return nationalitiesBlackList.contains(planeNationality);
    }

    private void pickUpPlaneFromAirport(IPlane plane) {
        boolean planeWasOnTheAirport = false;
        if (planeIsOnTheAirport(plane)) {
            landedPlanes.remove(plane);
            planeWasOnTheAirport = true;
        }
        System.out.println(getPickingUpResult(planeWasOnTheAirport));
    }

    private boolean planeIsOnTheAirport(IPlane plane) {
        return landedPlanes.contains(plane);
    }

    private String getPickingUpResult(boolean planeWasOnTheAirPort) {
        StringBuilder pickingUpResult = new StringBuilder()
                .append("Picking up from airport ").append(planeWasOnTheAirPort ? "executed" : "unexecuted")
                .append(". (Plane was on the airport: ").append(planeWasOnTheAirPort);
        return pickingUpResult.toString();
    }
}
