package proxy.c;

public class BeforeAdvice implements IAdvice {

	@Override
	public void exec() {
		System.out.println("beforeAdvice has exec");
	}

}
