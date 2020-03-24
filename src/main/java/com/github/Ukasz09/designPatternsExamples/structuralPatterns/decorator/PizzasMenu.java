package com.github.Ukasz09.designPatternsExamples.structuralPatterns.decorator;


import java.util.ArrayList;
import java.util.List;

public class PizzasMenu {
    private List<IPizzaDecorator> pizzasList;

    //----------------------------------------------------------------------------------------------------------------//
    public PizzasMenu() {
        pizzasList = new ArrayList<>();
        addDefaultPizzas();
    }

    //----------------------------------------------------------------------------------------------------------------//
    private void addDefaultPizzas() {
        addMargarita();
        addVege();
        addHumblePizza();
    }

    private void addMargarita() {
        IPizzaDecorator margaritaPizza = new HamPizzaDecorator(new CheesePizzaDecorator(new PineapplePizzaDecorator(new BasePizzaDecorator())));
        margaritaPizza.setName("Margarita");
        pizzasList.add(margaritaPizza);
    }

    private void addVege() {
        IPizzaDecorator vegePizza = new CheesePizzaDecorator(new PineapplePizzaDecorator(new BasePizzaDecorator()));
        vegePizza.setName("Vege Pizza");
        pizzasList.add(vegePizza);
    }

    private void addHumblePizza() {
        IPizzaDecorator humblePizza = new HamPizzaDecorator(new BasePizzaDecorator());
        humblePizza.setName("Humble pizza");
        pizzasList.add(humblePizza);
    }

    public void printMenu() {
        System.out.println("--MENU--\n");
        pizzasList.forEach(IPizzaDecorator::printPizzaComponentsInfo);
    }

    public void addNewPizzaToMenu(IPizzaDecorator pizza) {
        pizzasList.add(pizza);
    }
}

