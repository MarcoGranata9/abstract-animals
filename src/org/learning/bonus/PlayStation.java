package org.learning.bonus;

public class PlayStation implements PlayStop{
    @Override
    public void play() {
        System.out.println("Sono una Playstation in modalità play");
    }

    @Override
    public void stop() {
        System.out.println("Sono una Playstation in modalità stop");
    }
}
