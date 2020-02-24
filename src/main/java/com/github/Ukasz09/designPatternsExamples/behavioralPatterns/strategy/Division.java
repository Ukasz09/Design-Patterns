package com.github.Ukasz09.designPatternsExamples.behavioralPatterns.strategy;

public class Division implements IOperationType {
    @Override
    public double doOperation(double fstNumber, double sndNumber) {
        if (sndNumber == 0)
            throw new IllegalArgumentException("Division by zero");
        return fstNumber / sndNumber;
    }
}
