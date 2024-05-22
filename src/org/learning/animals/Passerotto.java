package org.learning.animals;

public class Passerotto extends Animale implements CanFly{
    private final static String GEN_NAME = "passerotto";
    @Override
    public void cry(){
        System.out.println("Tuba");
    }

    @Override
    public void eat() {
        System.out.println("Semi");
    }

    @Override
    public void vola(){
        System.out.println(GEN_NAME + ":" + "Sto volando!!!");
    }
}
