package decorator;

public class ConcreteDecoratorA extends Decorator {
	
	public ConcreteDecoratorA(Component component) {
		super(component);
	}
	
	private void decoratorMethodA()
	{
		System.out.println("decoratorMethodA");
	}
	
	@Override
	public void doSomething() {
		decoratorMethodA();
		super.doSomething();
	}
}
