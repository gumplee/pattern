package chain;

public class ConcreteHandlerA extends Handler{
	
	private Level level;
	public ConcreteHandlerA(Level level) {
		this.level = level;
	}
	@Override
	public Level getLevel() {
		return level;
	}

	@Override
	public Response echo() {
		return new Response("ConcreteHandlerA echo");
	}

}
