package com.github.Ukasz09.designPatternsExamples.behavioralPatterns.strategy;

public class Addition implements IOperationType {

    @Override
    public double doOperation(double fstNumber, double sndNumber) {
        return fstNumber + sndNumber;
    }
}
