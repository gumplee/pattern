package observer;

import java.util.Vector;

public abstract class Subject {
	private Vector<Observer> observers = new Vector<Observer>();
	public void addObserver(Observer observer)
	{
		this.observers.add(observer);
	}
	public void deleteObserver(Observer observer)
	{
		this.observers.remove(observer);
	}
	public void notifyAllObserver()
	{
		for(Observer o : observers)
		{
			o.update();
		}
	}
}
