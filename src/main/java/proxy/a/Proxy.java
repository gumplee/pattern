package proxy.a;

public class Proxy implements Subject {
	private Subject subject;
	public Proxy(String name) {
		try {
			this.subject = new RealSubject(this, name);
		} catch (Exception e) {
			e.printStackTrace();
		}
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
}
