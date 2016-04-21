package composite;

import java.util.List;

public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	@Deprecated
	public void add(Component child) {
		throw new UnsupportedOperationException();
	}

	@Override
	@Deprecated
	public boolean delete(Component child) {
		throw new UnsupportedOperationException();
	}

	@Override
	@Deprecated
	public List<Component> getChild() {
		throw new UnsupportedOperationException();
	}
}
