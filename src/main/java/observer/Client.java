package observer;


public class Client {
	public static void main(String[] args) {
		Observer observerA = new ConcreteObserverA();
		Observer observerB = new ConcreteObserverB();
		
		ConcreteSubject subject = new ConcreteSubject();
		subject.addObserver(observerA);
		subject.addObserver(observerB);
		
		subject.doSomething();
	}
}
