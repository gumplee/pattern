package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	public Composite(String name)
	{
		super(name);
	}
	private List<Component> list = new ArrayList<Component>();
	@Override
	public void add(Component component)
	{
		list.add(component);
	}
	@Override
	public List<Component> getChild()
	{
		return this.list;
	}
	@Override
	public boolean delete(Component child) {
		return list.remove(child);
	}
}
