package com.github.Ukasz09.designPatternsExamples.structuralPatterns.decorator;

public class PineapplePizzaDecorator extends BasePizzaDecorator {
    private static final String COMPONENT_INFO = "Supp: Pineapple\n";

    private IPizzaDecorator pizzaDecorator;

    //----------------------------------------------------------------------------------------------------------------//
    public PineapplePizzaDecorator(IPizzaDecorator pizzaDecorator) {
        this.pizzaDecorator = pizzaDecorator;
    }

    //----------------------------------------------------------------------------------------------------------------//
    @Override
    public String addedComponents() {
        return pizzaDecorator.addedComponents() + COMPONENT_INFO;
    }
}
