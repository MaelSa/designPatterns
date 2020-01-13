package com.company;

import java.util.Collection;
import java.util.List;

public class Supprime<E> extends Options<E> {
    public Supprime(List<E> list) {
        super(list);
    }

    @Override
    public Object remove(int index){
        return null;
    }

    public boolean removeAll(Collection c){
        return false;
    }
}
