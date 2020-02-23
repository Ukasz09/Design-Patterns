package com.github.Ukasz09.designPatternsExamples.mediator;

public interface IControlTowerMediator {

    void notify(IPlane sender, AirPortEvents airPortEvents);
}
