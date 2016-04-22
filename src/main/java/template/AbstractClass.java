package template;

public abstract class AbstractClass {
	public abstract void doSomething();
	public abstract void doAnything();
	public abstract boolean isTrue();
	public void common()
	{
		doSomething();
		doAnything();
		if (isTrue()) {
			System.out.println("is true");
		}
	}
}
