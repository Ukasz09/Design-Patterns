package com.github.Ukasz09.designPatternsExamples.structuralPatterns.decorator;

public class BasePizzaDecorator implements IPizzaDecorator {
    private static final String COMPONENT_INFO = "Base: boundt cake\n";

    private String pizzaName;

    //----------------------------------------------------------------------------------------------------------------//
    public BasePizzaDecorator() {
        setName("NOT NAMED PIZZA");
    }

    //----------------------------------------------------------------------------------------------------------------//
    @Override
    public String addedComponents() {
        return COMPONENT_INFO;
    }

    @Override
    public void printPizzaComponentsInfo() {
        System.out.println(pizzaName + "\n");
        System.out.println(addedComponents());
    }

    @Override
    public void setName(String pizzaName) {
        this.pizzaName = pizzaName;
    }
}
