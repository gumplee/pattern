package proxy.b;

public class Proxy implements Subject {
	private Subject subject;
	public Proxy(Subject subject) {
		this.subject = subject;
	}
	@Override
	public void request() {
		before();
		this.subject.request();
		after();
	}
	
	public void before()
	{
		System.out.println("proxy before dosomething");
	}
	public void after()
	{
		System.out.println("proxy after dosomething");
	}
	@Override
	public Subject getProxy() {
		return this;
	}
}
