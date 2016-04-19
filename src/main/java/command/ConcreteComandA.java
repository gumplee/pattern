package command;

public class ConcreteComandA extends Command {
	private Receiver receiver;
	public ConcreteComandA(Receiver receiver)
	{
		this.receiver = receiver;
	}
	public void execute()
	{
		receiver.doSomething();
	}
}
