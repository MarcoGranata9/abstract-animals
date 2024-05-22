package org.learning.animals;

public class Aquila extends Animale implements CanFly{
    private final static String GEN_NAME = "aquila";
    @Override
    public void cry(){
        System.out.println("Stride");
    }

    @Override
    public void eat() {
        System.out.println("Carne");
    }

    @Override
    public void vola(){
        System.out.println(GEN_NAME + ":" + "Sto volando!!!");
    }

}
