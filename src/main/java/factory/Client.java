package factory;

public class Client {
	public static void main(String[] args) {
		Factory factory = new ConcreteFactory();
		ConcreteProductB product = factory.createProduct(ConcreteProductB.class);
		product.methodB();
	}
}
