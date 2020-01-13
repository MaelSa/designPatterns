package com.company;

public class E1 extends Etat {
    @Override
    public Etat a() {
        System.out.println("On entre dans E2");
        return new E2();
    }

    @Override
    public Etat b() {
        System.out.println("On entre dans E3");
        return new E3();
    }
}
