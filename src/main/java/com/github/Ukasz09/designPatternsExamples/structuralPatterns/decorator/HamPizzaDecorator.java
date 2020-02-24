package com.github.Ukasz09.designPatternsExamples.structuralPatterns.decorator;


public class HamPizzaDecorator extends BasePizzaDecorator {
    private static final String COMPONENT_INFO = "Supp: ham\n";

    private IPizzaDecorator pizzaDecorator;

    //----------------------------------------------------------------------------------------------------------------//
    public HamPizzaDecorator(IPizzaDecorator pizzaDecorator) {
        this.pizzaDecorator = pizzaDecorator;
    }

    //----------------------------------------------------------------------------------------------------------------//
    @Override
    public String addedComponents() {
        return pizzaDecorator.addedComponents() + COMPONENT_INFO;
    }
}
