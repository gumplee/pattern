package chain;

public class ConcreteHandlerB extends Handler {
	private Level level;
	public ConcreteHandlerB(Level level) {
		this.level = level;
	}
	@Override
	public Level getLevel() {
		return level;
	}

	@Override
	public Response echo() {
		return new Response("ConcreteHandlerB echo");
	}
}
