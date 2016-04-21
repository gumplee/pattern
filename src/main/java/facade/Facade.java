package facade;

public class Facade {
	ClassA a = new ClassA();
	ClassB b = new ClassB();
	ClassC c = new ClassC();
	ComplexClass cc = new ComplexClass();
	
	public void callMethodA()
	{
		this.a.methodA();
	}
	public void callMethodB()
	{
		this.b.methodB();
	}
	public void callMethodC()
	{
		this.c.methodC();
	}
	
	/**
	 * 
	 * 门面对象不参与到具体的业务逻辑
	 *
	 */
	public void callComplexMethod()
	{
		this.cc.complexMethod();
	}
}
