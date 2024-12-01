package org.hockeymanager.manager;

import org.hockeymanager.players.*;

import java.util.ArrayList;
import java.util.List;

public class HockeyManager {
    private List<Player> players;

    public HockeyManager() {
        players = new ArrayList<>();
    }
    public void addNewForward(String name, int age, int goals) {
        players.add(new Forward(name, age, goals));
    }
    public void addNewDefender(String name, int age, int hits) {
        players.add(new Defender(name, age, hits));
    }
    public void addNewGoalie(String name, int age, int wins) {
        players.add(new Goalie(name, age, wins));
    }
    public void printNameAndAgeOfTheYoungestPlayer() {
        if (players.isEmpty()) {
            System.out.println("No players added yet.");
            return;
        }

        int minAge = players.stream()
                .mapToInt(Player::getAge)
                .min()
                .getAsInt();

        List<Player> youngestPlayers = players.stream()
                .filter(player -> player.getAge() == minAge)
                .toList();

        System.out.println("The youngest players are:");
        youngestPlayers.forEach(player ->
                System.out.println(player.getName() + ", Age: " + player.getAge())
        );
    }
    public void printAllPlayers() {
        if (players.isEmpty()) {
            System.out.println("No players added yet.");
            return;
        }
        players.forEach(player -> {
            System.out.println("Name: " + player.getName() + ", Age: " + player.getAge());
            if (player instanceof Forward) {
                System.out.println("Goals: " + ((Forward) player).getGoals());
            } else if (player instanceof Defender) {
                System.out.println("Hits: " + ((Defender) player).getHits());
            } else if (player instanceof Goalie) {
                System.out.println("Wins: " + ((Goalie) player).getWins());
            }
        });
    }
}
