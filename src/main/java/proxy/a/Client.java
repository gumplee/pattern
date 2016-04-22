package proxy.a;

public class Client {
	public static void main(String[] args) throws Exception {
		Subject proxy = new Proxy("zhangsan");
		proxy.request();
	}
}
