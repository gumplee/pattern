package factory;

public interface Factory {
	public <T extends Product> T createProduct(Class<T> c);
}
