package com.github.Ukasz09.designPatternsExamples.structuralPatterns.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        PizzasMenu pizzasMenu = new PizzasMenu();
        pizzasMenu.printMenu();

        IPizzaDecorator customPizza = new PineapplePizzaDecorator(new BasePizzaDecorator());
        customPizza.setName("Hipster Pizza");
        pizzasMenu.addNewPizzaToMenu(customPizza);
        pizzasMenu.printMenu();
    }
}
