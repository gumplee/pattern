package iterator;

import java.util.Vector;

public class ConcreteAggregate<E> implements Aggregate<E> {
	private Vector<E> vector = new Vector<E>();
	@Override
	public void add(E e) {
		this.vector.add(e);
	}

	@Override
	public E delete() {
		return this.vector.remove(0);
	}

	@Override
	public IIterator<E> iterator() {
		return new ConcreteIterator<E>(vector);
	}

}
