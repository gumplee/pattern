package template;

public abstract class AbstractClass {
	public abstract void doSomething();
	public abstract void doAnything();
	public abstract boolean isTrue();//钩子函数，用来约束父类中公用方法中的行为。 
	public void common()
	{
		doSomething();
		doAnything();
		if (isTrue()) {
			System.out.println("is true");
		}
	}
}
