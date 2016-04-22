package template;

public class ConcreteClassA extends AbstractClass {
	private boolean flag;
	@Override
	public void doSomething() {
		System.out.println("ConcreteClassA doSomething");
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	@Override
	public void doAnything() {
		System.out.println("ConcreteClassA doAnything");
	}

	@Override
	public boolean isTrue() {
		return isFlag();
	}

}
