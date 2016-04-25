package memento.b;

public class Mementor {
	private String state;
	public Mementor(String state)
	{
		this.state = state;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
