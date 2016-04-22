package builder;

public class ConcreteBuilder extends Builder {
	private Product product = new Product();
	@Override
	public void setPart() {
		product.setA(new PartA());
		product.setB(new PartB());
		product.setC(new PartC());
	}

	@Override
	public Product getProduct() {
		return product;
	}
	
}
