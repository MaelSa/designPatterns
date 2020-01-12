package DecoratorMat;

import java.util.Iterator;
import java.util.List;

public abstract class ListeDecorator<E> implements List {
    List<E> list;

    @Override
    public int size() {

        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean contains(final Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Iterator iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object[] toArray(final Object[] a) {
        // TODO Auto-generated method stub
        return null;
    }
    
}