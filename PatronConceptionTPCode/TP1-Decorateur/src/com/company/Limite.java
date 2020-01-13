package com.company;

import java.util.Collection;
import java.util.List;

public class Limite<E> extends Options<E> {
    private int limitMax;

    public Limite(List<E> list, int limitMax) {
        super(list);
        this.limitMax = limitMax;
    }

    @Override
    public boolean add(Object o) {
        if (liste.size()<limitMax)
            return super.add(o);
        else
            return false;
    }

    @Override
    public boolean addAll(Collection c){
        if(liste.size()+c.size()<limitMax)
            return super.addAll(c);
        else
            return false;
    }

    @Override
    public boolean addAll(int index,Collection c){
        if(liste.size()+c.size()<limitMax)
            return super.addAll(index,c);
        else
            return false;
    }
}
