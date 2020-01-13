package Decorateur;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTP extends listOption{
    int sizeMax;

    ListTP(int t){
        this.sizeMax = t;
    }


    @Override
    public int size() {
        return this.size();
    }

    @Override
    public boolean isEmpty() {
        return this.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return this.contains(o);
    }

    @Override
    public Iterator iterator() {
        return this.iterator();
    }

    @Override
    public Object[] toArray() {
        return this.toArray();
    }

    @Override
    public boolean add(Object o) {
        if (this.sizeMax > this.size()) {
            return this.add(o);
        }
        else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection c) {
        if (this.sizeMax > this.size()) {
            return this.addAll(c);
        }
        else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public boolean addAll(int index, Collection c) {
        if (this.sizeMax > this.size()) {
            return this.addAll(index,c);
        }
        else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public void clear() {
        this.clear();
    }

    @Override
    public Object get(int index) {
        return this.get(index);
    }

    @Override
    public Object set(int index, Object element) {
        return this.set(index,element);
    }

    @Override
    public void add(int index, Object element){
        if (this.sizeMax > this.size()) {
            this.add(index,element);
        }
        else{
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public Object remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(Object o) {
        return this.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return this.lastIndexOf(o);
    }

    @Override
    public ListIterator listIterator() {
        return this.listIterator();
    }

    @Override
    public ListIterator listIterator(int index) {
        return this.listIterator(index);
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return this.subList(fromIndex, toIndex);
    }

    @Override
    public boolean retainAll(Collection c) {
        return this.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection c) {
        return this.containsAll(c);
    }

    @Override
    public Object[] toArray(Object[] a) {
        return this.toArray(a);
    }
}
