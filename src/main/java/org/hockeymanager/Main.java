package org.hockeymanager;

import org.hockeymanager.manager.HockeyManager;

public class Main {
    public static void main(String[] args) {
        HockeyManager hockeyManager = new HockeyManager();

        hockeyManager.addNewForward("Jano", 33, 9);
        hockeyManager.addNewDefender("Ondrej", 25, 12);
        hockeyManager.addNewGoalie("Marek", 29, 0);
        hockeyManager.addNewForward("Tomáš", 28, 5);
        hockeyManager.addNewGoalie("Jozef", 25, 3);

        hockeyManager.printNameAndAgeOfTheYoungestPlayer();
        hockeyManager.printAllPlayers();
    }
}