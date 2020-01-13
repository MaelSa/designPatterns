package com.company;

public class Graphe {
    Etat etat;

    public Graphe(){
        this.etat = new E1();
    }
    public void a(){
        this.etat = this.etat.a();
    }
    public void b(){
        this.etat = this.etat.b();
    }
}
