package DesignPattern.tpDecorateur;

import java.util.Collection;
import java.util.List;

public class DecorateurListSupprimer<E> extends AbstractDecoratorList<E> {

	public DecorateurListSupprimer(List<E> list) {
		super(list);
	}

	@Override
	public boolean add(E e) {
		return list.add(e);
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		return list.addAll(c);
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		return list.addAll(index,c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return false;
	}

	@Override
	public void clear() {
	}

	@Override
	public E set(int index, E element) {
		return list.set(index, element);
	}

	@Override
	public void add(int index, E element) {
		list.add(index,element);
	}

	@Override
	public E remove(int index) {
		return null;
	}
}
