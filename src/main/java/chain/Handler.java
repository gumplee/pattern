package chain;

public abstract class Handler {
	
	private Handler nextHandler;
	
	public final Response handMessage(Request request)
	{
		Response response = null;
		if (this.getLevel().getLevel() == request.getRequestLevel().getLevel()) {
			return this.echo();
		}else {
			if (nextHandler != null) {
				System.out.println("get this to nextHandler");
				return this.nextHandler.handMessage(request);
			}else {
				System.out.println("not supported!");
			}
		}
		return response;
	}
	
	public void setNext(Handler nextHandler)
	{
		this.nextHandler = nextHandler;
	}
	
	public abstract Level getLevel();
	public abstract Response echo();
}
