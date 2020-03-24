package com.github.Ukasz09.designPatternsExamples.structuralPatterns.facade;

import java.util.HashSet;
import java.util.Set;

public class UserManagement {
    private Set<String> loggedUsers;
    private Set<String> loggedAdmins;

    //----------------------------------------------------------------------------------------------------------------//
    public UserManagement() {
        loggedUsers = new HashSet<>();
        loggedAdmins = new HashSet<>();
    }

    //----------------------------------------------------------------------------------------------------------------//
    public void login(String login) {
        System.out.println("Some validation need to be done here. Need to show UI");
        loggedUsers.add(login);
    }

    public void register() {
        System.out.println("User try to register on the website. Need to show UI");
    }

    public void printAuditTrial(String userLogin) {
        System.out.println("Printing audit trial for" + userLogin);
    }

    boolean isLoggedAsUser(String login) {
        return loggedUsers.contains(login);
    }

    boolean isLoggedAsAdmin(String login) {
        return loggedAdmins.contains(login);
    }

    public void loginAsAdmin(String login) {
        loggedAdmins.add(login);
    }
}
