package org.hockeymanager.players;
public abstract class Player {
    private final String name;
    private final int age;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}