package proxy.b;

public class RealSubject implements Subject {
	private String name;
	private Subject proxy;
	public RealSubject(String name)
	{
		this.name = name;
	}
	@Override
	public void request() {
		if (isProxy()) {
			System.out.println(name + "RealSubject request");
		}else {
			System.out.println("please access by proxy");
		}
		
	}
	@Override
	public Subject getProxy() {
		proxy = new Proxy(this);
		return proxy;
	}
	public boolean isProxy()
	{
		return this.proxy != null;
	}
}
