package com.company;

public class E2 extends Etat {
    @Override
    public Etat a() {
        System.out.println("On entre dans E4");
        return new E4();
    }

    @Override
    public Etat b() {
        System.out.println("On reste dans E2");
        return this;
    }
}
