package template;

public class ConcreteClassB extends AbstractClass {
	private boolean flag;
	@Override
	public void doSomething() {
		System.out.println("ConcreteClassB doSomething");
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	@Override
	public void doAnything() {
		System.out.println("ConcreteClassB doAnything");
	}

	@Override
	public boolean isTrue() {
		return isFlag();
	}

}
