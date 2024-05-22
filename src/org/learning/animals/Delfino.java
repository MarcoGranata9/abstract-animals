package org.learning.animals;

public class Delfino extends Animale implements CanSwim{
    private final static String GEN_NAME = "delfino";

    @Override
    public void cry(){
        System.out.println("Fischia");
    }

    @Override
    public void eat() {
        System.out.println("Pesce");
    }

    @Override
    public void nuota(){
        System.out.println(GEN_NAME + ":" + "Sto nuotando!!!");
    }

}
