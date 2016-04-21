package observer;

public class ConcreteSubject extends Subject {
	public void doSomething()
	{
		System.out.println("ConcreteSubject doSomething");
		super.notifyAllObserver();
	}
}
