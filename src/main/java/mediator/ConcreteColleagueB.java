package mediator;

public class ConcreteColleagueB extends Colleague {

	public ConcreteColleagueB(Mediator mediator) {
		super(mediator);
	}
	public void slefMethodB()
	{
		System.out.println("ConcreteColleagueB slefMethodB");
	}
	
	public void depMethod()
	{
		super.mediator.doSomethingB();
	}
}
