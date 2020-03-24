package com.github.Ukasz09.designPatternsExamples.structuralPatterns.facade;

import java.util.Scanner;

/**
 * Facade implementation - encapsulate methods from classes and make unique clean api for specific purpose
 */
public class ShopAPI {
    private static final String USER_NOT_LOGGED_MSG = "User is not logged";
    private static final String ACCESS_DENIED_MSG = "Cannot perform action. Access denied";
    private static final String INCORRECT_LOGIN_TO_ACCOUNT_MSG = "Incorrect login to account. Access denied";

    private String adminLogin = "admin";
    private String adminPassword = "admin";

    private Cart cart;
    private Storehouse storehouse;
    private UserManagement userManagement;
    private Scanner sc;

    //----------------------------------------------------------------------------------------------------------------//
    public ShopAPI() {
        cart = new Cart();
        storehouse = new Storehouse();
        userManagement = new UserManagement();
        sc = new Scanner(System.in);
    }

    //----------------------------------------------------------------------------------------------------------------//
    public void addToCart(String userLogin, String itemId) {
        if (userManagement.isLoggedAsUser(userLogin)) {
            Item itemToAdd = storehouse.getItem(itemId);
            if (itemToAdd != null)
                cart.addToCart(itemToAdd);
            else System.err.println("Invalid item");
        } else System.err.println(USER_NOT_LOGGED_MSG);
    }

    public boolean removeFromCart(Item item, String userLogin) {
        if (userManagement.isLoggedAsUser(userLogin))
            return cart.removeFromCart(item);
        else System.err.println(USER_NOT_LOGGED_MSG);
        return false;
    }

    public void printItemsInCartList(String userLogin) {
        if (userManagement.isLoggedAsUser(userLogin))
            cart.printItemsInCartList();
        else System.err.println(USER_NOT_LOGGED_MSG);
    }

    public void login() {
        System.out.println("Login: ");
        String userLogin = sc.nextLine();
        userManagement.login(userLogin);
    }

    public void register() {
        userManagement.register();
    }

    public void printAuditTrial(String userLogin) {
        if (userManagement.isLoggedAsUser(userLogin))
            userManagement.printAuditTrial(userLogin);
        else System.err.println(USER_NOT_LOGGED_MSG);
    }

    public void printAvailableItemsList() {
        storehouse.printAvailableItemsList();
    }

    public void loginAsAdmin() {
        System.out.print("Login: ");
        String login = sc.nextLine();
        System.out.print("Password: ");
        String password = sc.nextLine();

        if (login.equals(adminLogin) && password.equals(adminPassword))
            userManagement.loginAsAdmin(login);
        else System.err.println(INCORRECT_LOGIN_TO_ACCOUNT_MSG);
    }

    public void addToStorehouse(Item item) {
        if (userManagement.isLoggedAsAdmin(adminLogin))
            storehouse.addToStorehouse(item);
        else System.err.println(ACCESS_DENIED_MSG);
    }

    public void removeFromStorehouse(Item item) {
        if (userManagement.isLoggedAsAdmin(adminLogin))
            storehouse.removeFromStorehouse(item);
        else System.err.println(ACCESS_DENIED_MSG);
    }
}
