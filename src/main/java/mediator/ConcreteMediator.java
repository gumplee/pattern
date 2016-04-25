package mediator;

public class ConcreteMediator extends Mediator {

	@Override
	public void doSomethingA() {
		super.cca.slefMethodA();
		super.ccb.slefMethodB();
	}

	@Override
	public void doSomethingB() {
		super.ccb.slefMethodB();
		super.cca.slefMethodA();
	}

}
