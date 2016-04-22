package template;

public class Client {
	public static void main(String[] args) {
		ConcreteClassA a = new ConcreteClassA();
		a.setFlag(true);
		a.common();
		ConcreteClassB b = new ConcreteClassB();
		b.setFlag(true);
		b.common();
	}
}
