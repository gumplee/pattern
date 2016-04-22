package proxy.c;


public class Client {
	public static void main(String[] args) throws Exception {
		Subject subject = new RealSubject();
		Subject proxy = SubjectDynamicProxy.newProxyInstace(subject);
		proxy.request("Finish");
	}
}
