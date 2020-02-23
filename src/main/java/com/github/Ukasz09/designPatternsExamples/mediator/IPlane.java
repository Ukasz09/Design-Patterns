package com.github.Ukasz09.designPatternsExamples.mediator;

public interface IPlane {
    Nationality getNationality();

    void tryToLandOnAirport(IControlTowerMediator controlTower);

    void pickUpFromTheAirport(IControlTowerMediator controlTower);
}
