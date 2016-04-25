package memento.c;

import java.util.HashMap;

public class Memento {
	private HashMap<String, Object> stateHashMap;
	
	public Memento(HashMap<String, Object> map)
	{
		this.stateHashMap = map;
	}

	public HashMap<String, Object> getStateHashMap() {
		return stateHashMap;
	}

	public void setStateHashMap(HashMap<String, Object> stateHashMap) {
		this.stateHashMap = stateHashMap;
	}
	
}
