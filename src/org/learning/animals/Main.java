package org.learning.animals;

public class Main {
    public static void main(String[] args) {

        new Cane().cry();
        new Passerotto().cry();
        new Aquila().cry();
        new Delfino().cry();

        new Cane().eat();
        new Passerotto().eat();
        new Aquila().eat();
        new Delfino().eat();

        faiVolare(new Aquila());
        faiVolare(new Passerotto());
        faiNuotare(new Cane());
        faiNuotare(new Delfino());
    }

    public static void faiVolare(CanFly animal){
        animal.vola();
    }
    public static void faiNuotare(CanSwim animal){
        animal.nuota();
    }
}
