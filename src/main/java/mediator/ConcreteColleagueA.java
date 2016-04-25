package mediator;

public class ConcreteColleagueA extends Colleague {

	public ConcreteColleagueA(Mediator mediator) {
		super(mediator);
	}
	public void slefMethodA()
	{
		System.out.println("ConcreteColleagueA slefMethodA");
	}
	
	public void depMethod()
	{
		super.mediator.doSomethingA();
	}
}
