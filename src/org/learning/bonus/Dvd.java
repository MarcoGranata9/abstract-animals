package org.learning.bonus;

public class Dvd implements PlayStop{
    @Override
    public void play() {
        System.out.println("Sono una Lettore DVD in modalità play");
    }

    @Override
    public void stop() {
        System.out.println("Sono una Lettore DVD in modalità stop");
    }

}
