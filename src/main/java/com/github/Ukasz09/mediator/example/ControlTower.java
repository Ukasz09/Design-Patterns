package com.github.Ukasz09.mediator.example;

import com.github.Ukasz09.mediator.EventType;
import com.github.Ukasz09.mediator.IComponent;
import com.github.Ukasz09.mediator.IMediator;

import java.util.ArrayList;
import java.util.List;

public class ControlTower implements IMediator {
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
    public void notify(IComponent sender, EventType eventType) {
        if (IsPlane(sender)) {
            IPlane plane = (IPlane) sender;
            checkPlaneActions(plane, eventType);
        } else System.out.println("This is not a plane!");
    }

    private void checkPlaneActions(IPlane plane, EventType eventType) {
        switch (eventType) {
            case LANDING:
                landPlane(plane);
                break;
            case PICK_UP_FROM_AIRPORT:
                pickUpPlaneFromAirport(plane);
                break;
        }
    }

    private boolean IsPlane(IComponent sender) {
        return sender instanceof IPlane;
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
