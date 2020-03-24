package com.github.Ukasz09.designPatternsExamples.behavioralPatterns.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        OperationManager operationManager = new OperationManager(new Addition());
        printNumber(operationManager.doOperation(12, 9));
        operationManager.setOperationType(new Multiplication());
        printNumber(operationManager.doOperation(8, 7));
        operationManager.setOperationType(new Division());
        printNumber(operationManager.doOperation(15, 3));
    }

    private static void printNumber(double number) {
        System.out.println(number);
    }
}
