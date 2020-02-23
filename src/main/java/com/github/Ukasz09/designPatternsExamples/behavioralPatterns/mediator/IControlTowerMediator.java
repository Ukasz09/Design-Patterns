package com.github.Ukasz09.designPatternsExamples.behavioralPatterns.mediator;

public interface IControlTowerMediator {

    void notify(IPlane sender, AirPortEvents airPortEvents);
}
