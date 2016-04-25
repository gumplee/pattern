package memento.b;

public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Mementor createMementor()
	{
		return new Mementor(getState());
	}
	
	public void restoreMementor(Mementor mementor)
	{
		setState(mementor.getState());
	}
}
