package org.learning.bonus;

public class Creator {
    public static PlayStop create(String type) {
        if (type.equalsIgnoreCase("playstation")) {
            return new PlayStation();
        } else {
            return new Dvd();
        }
    }
}
