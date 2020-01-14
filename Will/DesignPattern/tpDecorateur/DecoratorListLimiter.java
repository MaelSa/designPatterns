package DesignPattern.tpDecorateur;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class DecoratorListLimiter<E> extends AbstractDecoratorList<E> {

	private final int limitSize;
	private int currentSize;
	
	public DecoratorListLimiter(List<E> list) {
		this(list,0);
	}
	
	public DecoratorListLimiter(List<E> list, int sizeLimit) {
		super(list);
		this.limitSize = sizeLimit;
		this.currentSize = 0;
	}
	
	@Override
	public boolean add(E e) {
		if(currentSize+1 <= limitSize) {
			currentSize++;
			return list.add(e);
		}else {
			return false;
		}
	}

	@Override
	public boolean remove(Object o) {
		boolean isRemove = list.remove(o);
		if(isRemove)currentSize--;
		return isRemove;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		if(currentSize+c.size() <= limitSize) {
			return list.addAll(c);
		}
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		if(index+c.size() <= limitSize) {
			return list.addAll(index,c);
		}
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		boolean isRemove = list.removeAll(c);
		if(isRemove)currentSize-=c.size();
		return isRemove;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		boolean isRemove = list.retainAll(c);
		if(isRemove)currentSize-=c.size();
		return isRemove;
	}

	@Override
	public void clear() {
		currentSize=0;
		list.clear();
	}

	@Override
	public E set(int index, E element) {
		return list.set(index, element);
	}

	@Override
	public void add(int index, E element) {
		if(index <= limitSize) {
			list.add(index,element);
		}
	}

	@Override
	public E remove(int index) {
		E isRemove = list.remove(index);
		if(Objects.nonNull(isRemove))currentSize--;
		return isRemove;
	}
}
