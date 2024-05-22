package org.learning;

public class Cane extends Animale implements CanSwim{
    // Costanti
    private final static String GEN_NAME = "cane";
    @Override
    public void cry(){
        System.out.println("Abbaia");
    }

    @Override
    public void eat() {
        System.out.println("Crocchette");
    }

    @Override
    public void nuota(){
        System.out.println(GEN_NAME + ":" + "Sto nuotando!!!");
    }
}
