package org.hockeymanager.players;

public class Forward extends Player {
    private final int goals;

    public Forward(String name, int age, int goals) {
        super(name, age);
        this.goals = goals;
    }

    public int getGoals() {
        return goals;
    }
}