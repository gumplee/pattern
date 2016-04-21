package factory;

public class ConcreteFactory implements Factory {

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Product> T createProduct(Class<T> c) {
		Product product = null;
		try {
			product = (Product)Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return (T)product;
	}

}
