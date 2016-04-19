package command;

public class Client {
	public static void main(String[] args) {
		Receiver concreteReceiverA = new ConcreteReceiverA();
		Command concreteCommandA = new ConcreteComandA(concreteReceiverA);
		Invoker invoker = new Invoker(concreteCommandA);
		invoker.action();
	}
}
