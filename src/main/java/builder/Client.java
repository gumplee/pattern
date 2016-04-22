package builder;

public class Client {
	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder();
		Diretor diretor = new Diretor(builder);
		diretor.construct();
		Product product = builder.getProduct();
		product.getA().printName();
		product.getB().printName();
		product.getC().printName();
		
	}
}
