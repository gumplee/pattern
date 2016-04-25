package memento.a;

public class Originator implements Cloneable {
	private Originator backup;
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public void createMementor()
	{
		this.backup = (Originator) this.clone();
	}
	public void restoreMementor()
	{
		setState(this.backup.getState());
	}
	
	public Originator getBackup() {
		return backup;
	}
	public void setBackup(Originator backup) {
		this.backup = backup;
	}
	@Override
	protected Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
