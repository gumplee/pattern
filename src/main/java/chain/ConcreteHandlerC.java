package chain;

public class ConcreteHandlerC extends Handler {
	private Level level;
	public ConcreteHandlerC(Level level) {
		this.level = level;
	}
	@Override
	public Level getLevel() {
		return level;
	}

	@Override
	public Response echo() {
		return new Response("ConcreteHandlerC echo");
	}
}
