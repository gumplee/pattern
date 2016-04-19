package command;

public class ConcreteComandB extends Command {
	private Receiver receiver;
	public ConcreteComandB(Receiver receiver)
	{
		this.receiver = receiver;
	}
	public void execute()
	{
		receiver.doSomething();
	}
}
