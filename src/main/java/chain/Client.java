package chain;

public class Client {
	public static void main(String[] args) {
		Level level = new Level(1);
		Level level2 = new Level(2);
		Request request = new Request(level2);
		Handler a = new ConcreteHandlerA(level);
		Handler b = new ConcreteHandlerB(level);
		Handler c = new ConcreteHandlerC(level2);
		a.setNext(b);
		b.setNext(c);
		Response response = a.handMessage(request);
		System.out.println(response.toString());
	}
}
