package com.github.Ukasz09.designPatternsExamples.structuralPatterns.decorator;

public class CheesePizzaDecorator extends BasePizzaDecorator {
    private static final String COMPONENT_INFO = "Supp: cheese\n";

    private IPizzaDecorator pizzaDecorator;

    //----------------------------------------------------------------------------------------------------------------//
    public CheesePizzaDecorator(IPizzaDecorator pizzaDecorator) {
        this.pizzaDecorator = pizzaDecorator;
    }

    //----------------------------------------------------------------------------------------------------------------//
    @Override
    public String addedComponents() {
        return pizzaDecorator.addedComponents() + COMPONENT_INFO;
    }
}