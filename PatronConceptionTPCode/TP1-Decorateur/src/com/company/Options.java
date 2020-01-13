package com.company;
import java.util.*;

public class Options<E> implements List {
    protected List<E> liste;

    public Options(List<E> list){
        liste = list;
    }
    @Override
    public int size() {
        return liste.size();
    }

    @Override
    public boolean isEmpty() {
        return liste.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return liste.contains(o);
    }

    @Override
    public Iterator iterator() {
        return liste.iterator();
    }

    @Override
    public Object[] toArray() {
        return liste.toArray();
    }

    @Override
    public boolean add(Object o) {
        return liste.add((E)o);
    }

    @Override
    public boolean remove(Object o) {
        return liste.remove((E)o);
    }

    @Override
    public boolean addAll(Collection c) {
        return liste.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return liste.addAll(index, c);
    }

    @Override
    public void clear() {
        liste.clear();
    }

    @Override
    public Object get(int index) {
        return liste.get(index);
    }

    @Override
    public Object set(int index, Object element) {
        return liste.set(index, (E)element);
    }

    @Override
    public void add(int index, Object element) {
        liste.add(index, (E)element);
    }

    @Override
    public Object remove(int index) {
        return liste.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return liste.indexOf((E)o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return liste.lastIndexOf((E)o);
    }

    @Override
    public ListIterator listIterator() {
        return liste.listIterator();
    }

    @Override
    public ListIterator listIterator(int index) {
        return liste.listIterator(index);
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return liste.subList(fromIndex, toIndex);
    }

    @Override
    public boolean retainAll(Collection c) {
        return liste.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection c) {
        return liste.removeAll(c);
    }

    @Override
    public boolean containsAll(Collection c) {
        return liste.containsAll(c);
    }

    @Override
    public Object[] toArray(Object[] a) {
        return liste.toArray(a);
    }
}
