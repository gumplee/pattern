package decorator;

public class ConcreteDecoratorB extends Decorator {
	
	public ConcreteDecoratorB(Component component) {
		super(component);
	}
	
	private void decoratorMethodB()
	{
		System.out.println("decoratorMethodB");
	}
	
	@Override
	public void doSomething() {
		decoratorMethodB();
		super.doSomething();
	}
}
