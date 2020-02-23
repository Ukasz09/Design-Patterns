package com.github.Ukasz09.designPatternsExamples.behavioralPatterns.mediator;


public class MediatorPatternMain {
    public static void main(String[] args) {
        ControlTower controlTower = new ControlTower();
        IPlane planePOL = new Plane(Nationality.POLISH);
        IPlane planeRUS = new Plane(Nationality.RUSSIAN);
        IPlane planeHUN = new Plane(Nationality.HUNGARIAN);

        planePOL.tryToLandOnAirport(controlTower);
        planePOL.tryToLandOnAirport(controlTower);
        planeHUN.tryToLandOnAirport(controlTower);
        planeRUS.tryToLandOnAirport(controlTower);
        planePOL.pickUpFromTheAirport(controlTower);
        planeRUS.pickUpFromTheAirport(controlTower);
        planePOL.pickUpFromTheAirport(controlTower);
    }
}
