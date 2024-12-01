package org.hockeymanager.players;

public class Goalie extends Player{
    private final int wins;

    public Goalie (String name, int age, int wins) {
        super(name, age);
        this.wins = wins;
    }

    public int getWins() {
        return wins;
    }
}