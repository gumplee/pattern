package decorator;

public class Client {
	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		component = new ConcreteDecoratorA(component);
		component = new ConcreteDecoratorB(component);
		component.doSomething();
	}
}
