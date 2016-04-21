package composite;

import java.util.List;

public abstract class Component {
	private String name;
	public Component(String name)
	{
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public abstract void add(Component child);
	public abstract boolean delete(Component child);
	public abstract List<Component> getChild();
}
