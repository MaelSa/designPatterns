package com.company;

public class E4 extends Etat {
    public E4(){
        System.out.println("Etat final");
    }

    @Override
    public Etat a() {
        System.out.println("Etat final");
        return this;
    }

    @Override
    public Etat b() {
        System.out.println("Etat final");
        return this;

    }
}
