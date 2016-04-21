package facade;

public class ComplexClass {
	ClassA a = new ClassA();
	ClassC c = new ClassC();
	public void complexMethod()
	{
		this.a.methodA();
		this.c.methodC();
	}
}
