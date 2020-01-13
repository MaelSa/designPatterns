package com.company;

public class E3 extends Etat {
    @Override
    public Etat a() {
        System.out.println("On reste dans E3");
        return this;
    }

    @Override
    public Etat b() {
        System.out.println("On entre dans E4");
        return new E4();
    }
}
