package iterator;

import java.util.Vector;

public class ConcreteIterator<E> implements IIterator<E> {
	private Vector<E> vector = new Vector<E>();
	private int cursor = 0;
	public ConcreteIterator(Vector<E> vector) {
		this.vector = vector;
	}
	@Override
	public boolean hasNext() {
		if (cursor < vector.size()) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public E next() {
		if (hasNext()) {
			return this.vector.get(cursor++);
		}
		else {
			return null;
		}
	}

	@Override
	public void remove() {
		this.vector.remove(cursor);
	}

}
