package mediator;

public abstract class Mediator {
	protected ConcreteColleagueA cca;
	protected ConcreteColleagueB ccb;
	public ConcreteColleagueA getCca() {
		return cca;
	}
	public void setCca(ConcreteColleagueA cca) {
		this.cca = cca;
	}
	public ConcreteColleagueB getCcb() {
		return ccb;
	}
	public void setCcb(ConcreteColleagueB ccb) {
		this.ccb = ccb;
	}
	
	public abstract void doSomethingA();
	public abstract void doSomethingB();
}
