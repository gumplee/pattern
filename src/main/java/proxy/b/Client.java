package proxy.b;

public class Client {
	public static void main(String[] args) throws Exception {
		Subject subject = new RealSubject("zhangsan");
		Subject proxy = subject.getProxy();
		proxy.request();
		
	}
}
