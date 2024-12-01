package org.hockeymanager.players;

public class Defender extends Player {
    private final int hits;

    public Defender(String name, int age, int hits) {
        super(name, age);
        this.hits = hits;
    }

    public int getHits() {
        return hits;
    }
}