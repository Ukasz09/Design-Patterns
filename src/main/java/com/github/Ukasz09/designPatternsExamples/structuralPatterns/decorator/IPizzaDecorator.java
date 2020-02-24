package com.github.Ukasz09.designPatternsExamples.structuralPatterns.decorator;

public interface IPizzaDecorator {
    String addedComponents();

    void printPizzaComponentsInfo();

    void setName(String pizzaName);
}
