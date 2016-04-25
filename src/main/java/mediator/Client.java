package mediator;

public class Client {
	public static void main(String[] args) {
		Mediator mediator = new ConcreteMediator();
		ConcreteColleagueA cca = new ConcreteColleagueA(mediator);
		ConcreteColleagueB ccb = new ConcreteColleagueB(mediator);
		mediator.setCca(cca);
		mediator.setCcb(ccb);
		
		mediator.doSomethingA();
		mediator.doSomethingB();
		
	}
}
