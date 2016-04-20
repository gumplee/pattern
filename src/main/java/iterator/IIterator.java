package iterator;

import java.util.Iterator;

public interface IIterator<E> extends Iterator<E>{

	boolean hasNext();

	E next();

	void remove();

}
