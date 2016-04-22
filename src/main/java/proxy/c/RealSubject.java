package proxy.c;

public class RealSubject implements Subject {

	@Override
	public void request(String str) {
		System.out.println("doSomething " + str);
	}

}
