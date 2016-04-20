package iterator;


public interface Aggregate<E> {
	public void add(E e);
	public E delete();
	public IIterator<E> iterator();
}
