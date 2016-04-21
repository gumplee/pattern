package abstractfactory;


public class Client {
	public static void main(String[] args) {
		AbstractFactory factory1 = new ConcreteFactory1();
		AbstractFactory factory2 = new ConcreteFactory2();
		
		AbstractProductA productA1 = factory1.createProductA();
		AbstractProductA productA2 = factory2.createProductA();
		AbstractProductB productB1 = factory1.createProductB();
		AbstractProductB productB2 = factory2.createProductB();
		
		productA1.methodB();
		productA2.methodB();
		productB1.methodB();
		productB2.methodB();
	}
}
