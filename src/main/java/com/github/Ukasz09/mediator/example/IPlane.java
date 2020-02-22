package com.github.Ukasz09.mediator.example;

import com.github.Ukasz09.mediator.IComponent;
import com.github.Ukasz09.mediator.IMediator;

public interface IPlane extends IComponent {
    Nationality getNationality();

    void tryToLandOnAirport(IMediator controlTower);

    void pickUpFromTheAirport(IMediator controlTower);
}
