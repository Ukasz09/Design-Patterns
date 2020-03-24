package com.github.Ukasz09.designPatternsExamples.behavioralPatterns.strategy;

public class OperationManager {
    private IOperationType operationType;

    //----------------------------------------------------------------------------------------------------------------//
    public OperationManager(IOperationType IOperationType) {
        this.operationType = IOperationType;
    }

    //----------------------------------------------------------------------------------------------------------------//
    public void setOperationType(IOperationType operationType) {
        this.operationType = operationType;
    }

    public double doOperation(double fstNumber, double sndNumber) {
        return operationType.doOperation(fstNumber, sndNumber);
    }
}
