package org.learning.bonus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Per creare una Playstation premi: 1");
        System.out.println("Per creare un Lettore DVD premi: 2");
        String input = scanner.nextLine();

        PlayStop o = null;
        switch (input){
            case "1":
                o = Creator.create("playstation");
                break;
            case "2":
                o = Creator.create("dvd");
                break;
            default:
                System.out.println("Hai sbagliato tasto");
                break;
        }
        if (o != null){
            o.play();
            o.stop();
        }
    }
}
